package strategy;

import models.ParkingFloor;
import models.Vehicle;
import models.ParkingSpot;
import java.util.List;
import java.util.ArrayList;

public class NearestSpotStrategy implements SpotAllocationStrategy{

    public ParkingSpot findSpot(List<ParkingFloor> floors, Vehicle vehicle){
        for(ParkingFloor floor : floors){
            List<ParkingSpot> spots = floor.findAvailableSpot(vehicle.getType());
            if(!spots.isEmpty()){
                return spots.get(0);
            }

        }

        return null;
    }
}