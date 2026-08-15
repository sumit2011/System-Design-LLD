package models;

import enums.SpotType;
import enums.VehicleType;

public abstract class ParkingSpot{
    private final int id;
    private final SpotType type;
    private Vehicle vehicle;

    // constructor
    public ParkingSpot(int id,SpotType type){
        this.id= id;
        this.type = type;
    }

    // getters
    public int getId(){
        return id;
    }

    public SpotType getType(){
        return type;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    // methids
    public boolean isAvailable(){
        return vehicle == null;

    }

    public void parkVehicle(Vehicle vehicle){
        if(!isAvailable()){
            throw new IllegalStateException(
                "parking spot is already occupied"
            );
        }
        this.vehicle = vehicle;
    }

    public void removeVehicle(Vehicle vehicle){
        if(isAvailable()){
            throw new IllegalStateException(
                "parking spot is alrady empty"
            );
        }
        this.vehicle = null;
    }

    

}