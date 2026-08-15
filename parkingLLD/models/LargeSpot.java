package models;

import enums.SpotType;

public class LargeSpot extends ParkingSpot{
    public LargeSpot(int id){
        super(id,SpotType.LARGE);
    }
}