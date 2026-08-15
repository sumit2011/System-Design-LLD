package models;

import java.util.ArrayList;
import java.util.List;
import enums.SpotType;
import enums.VehicleType;

public class ParkingFloor{
    private final int floorNumber;
    private final List<ParkingSpot> spots;

    // constructor
    public ParkingFloor(int floorNumber ){
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
    }

    // getter;
    public int getFloorNumber(){
        return floorNumber;
    }

    public List<ParkingSpot> getSpots(){
        return spots;
    }

    // methods
    // addspot, findAvailableSpot, removeSpot, getOccupiedSpots, getAvailableSpots

    public String addSpot(ParkingSpot spot){
        spots.add(spot);
        return "spot added successfully";
    }

    public List<ParkingSpot> findAvailableSpot(VehicleType vehicleType){
        List <ParkingSpot> availableSpots = new ArrayList<>();
        for(ParkingSpot spot : spots){
            if(spot.isAvailable() && canFit(spot.getType(),vehicleType)){
                availableSpots.add(spot);
            }
        }


        return availableSpots;

    }
  
    private boolean canFit(SpotType  spotType, VehicleType vehicleType){
        return switch (vehicleType) {

            case BIKE ->
                    spotType == SpotType.BIKE ||
                    spotType == SpotType.COMPACT ||
                    spotType == SpotType.LARGE;

            case CAR ->
                    spotType == SpotType.COMPACT ||
                    spotType == SpotType.LARGE;

            case TRUCK ->
                    spotType == SpotType.LARGE;
        };
    }
   

}