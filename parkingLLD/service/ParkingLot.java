package service;

import models.ParkingFloor;
import strategy.SpotAllocationStrategy;
import strategy.PricingStrategy;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import models.Vehicle;
import models.ParkingSpot;
import models.Ticket;

public class ParkingLot{
    private String id;
    private String name;
    private List<ParkingFloor> floors;
    private SpotAllocationStrategy spotStrategy;
    private PricingStrategy pricingStrategy;
    private Map<String, Ticket> activeTickets;

    // constructor
    public ParkingLot(String name,List<ParkingFloor> floors, SpotAllocationStrategy spotStrategy, PricingStrategy pricingStrategy){
        this.name = name;
        this.spotStrategy = spotStrategy;
        this.pricingStrategy = pricingStrategy;
        this.floors = floors;

        this.activeTickets = new HashMap<>();
    }

    // methods
    // parkvehicle exitvehicle

    public Ticket parkVehicle(Vehicle vehicle){
        
        // find nearest parking sport
        ParkingSpot spot  = spotStrategy.findSpot(floors,vehicle);

        if(spot == null){
            throw new IllegalStateException("no spot available");
        }
        
        spot.parkVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle,spot);
        activeTickets.put(ticket.getTicketId(),ticket);
        return ticket;

    }

    public double exitVehicle(String ticketId){
        Ticket ticket = activeTickets.get(ticketId);
        if(ticket == null){
            return -1;
        }

        ticket.closeTicket();

        double amount = pricingStrategy.calculatePrice(ticket);
        ticket.getParkingSpot().removeVehicle(ticket.getVehicle());

        activeTickets.remove(ticketId);

        return amount;
    }
}