package strategy;

import models.ParkingFloor;
import models.Vehicle;
import models.ParkingSpot;
import java.util.List;

public interface SpotAllocationStrategy{
    ParkingSpot findSpot(
        List<ParkingFloor> floors,
        Vehicle vehicle
    );
}