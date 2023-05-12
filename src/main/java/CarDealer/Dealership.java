package CarDealer;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name,String address, String phone){

    }
    public ArrayList<Vehicle> getVehiclesByPrice(double min,double max){
        getVehiclesByPrice(min,max);
        return this.getVehiclesByPrice(min,max);
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        getVehiclesByMakeModel(make, model);
        return this.getVehiclesByMakeModel(make, model);
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min,int max){
        getVehiclesByYear(min, max);
        return this.getVehiclesByYear(min, max);
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        getVehiclesByColor(color);
        return this.getVehiclesByColor(color);
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        this.getVehiclesByMileage(min, max);
        return getVehiclesByMileage(min, max);
    }
    public ArrayList<Vehicle> getVehiclesByType(String VehicleType){
        getVehiclesByType(VehicleType);
        return this.getVehiclesByType(VehicleType);
    }
    public ArrayList<Vehicle> getAllVehicles(){
        getAllVehicles();
        return this.getAllVehicles();
    }
    public void addVehicles(Vehicle Vehicle){
        this.inventory.add(Vehicle);
    }
    public void removeVehicle(String Vehicle){
        this.inventory.remove(inventory);
    }
}
