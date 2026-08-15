package models;

import enums.SpotType;

public class BikeSpot extends ParkingSpot{
    public BikeSpot(int id){
        super(id, SpotType.BIKE);
    }
}