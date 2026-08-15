import models.BikeSpot;
import models.Car;
import models.CompactSpot;
import models.LargeSpot;
import models.ParkingFloor;
import models.Ticket;
import models.Vehicle;
import payment.Payment;
import payment.UpiPayment;
import service.ParkingLot;
import strategy.HourlyPricingStrategy;
import strategy.NearestSpotStrategy;
import strategy.PricingStrategy;
import strategy.SpotAllocationStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create floor
        ParkingFloor floor1 =
                new ParkingFloor(1);

        // Add parking spots
        floor1.addSpot(
                new BikeSpot(1)
        );

        floor1.addSpot(
                new BikeSpot(2)
        );

        floor1.addSpot(
                new CompactSpot(3)
        );

        floor1.addSpot(
                new CompactSpot(4)
        );

        floor1.addSpot(
                new LargeSpot(5)
        );

        List<ParkingFloor> floors =
                new ArrayList<>();

        floors.add(floor1);

        // Strategies
        SpotAllocationStrategy spotStrategy =
                new NearestSpotStrategy();

        PricingStrategy pricingStrategy =
                new HourlyPricingStrategy();

        // Parking Lot
        ParkingLot parkingLot =
                new ParkingLot(
                        "Mall Parking",
                        floors,
                        spotStrategy,
                        pricingStrategy
                );

        // Vehicle
        Vehicle car =
                new Car("BR01AB1234");

        // Park
        Ticket ticket =
                parkingLot.parkVehicle(car);

        System.out.println(
                "Vehicle parked successfully"
        );

        System.out.println(
                "Ticket ID: " +
                ticket.getTicketId()
        );

        System.out.println(
                "Spot ID: " +
                ticket.getParkingSpot().getId()
        );

        // Exit
        double amount =
                parkingLot.exitVehicle(
                        ticket.getTicketId()
                );

        System.out.println(
                "Parking Fee: ₹" + amount
        );

        // Payment
        Payment payment =
                new UpiPayment();

        payment.pay(amount);
    }
}