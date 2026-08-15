package models;

import enums.SpotType;

public class CompactSpot extends ParkingSpot{
    public CompactSpot(int id){
        super(id,SpotType.COMPACT);
    }
}