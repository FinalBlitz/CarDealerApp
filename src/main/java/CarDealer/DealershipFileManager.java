package CarDealer;

import java.io.*;
import java.util.Scanner;

public class DealershipFileManager {
    public Dealership getDealership() {

        Dealership FinalCar = new Dealership("Final Blitz", "7845 Nw 145 St", "784-995-4121");

        String filename = "inventory.csv";

        try {
            BufferedReader wantToReadItTo = new BufferedReader(new FileReader(filename));
            String pipe;
            wantToReadItTo.readLine();
            while ((pipe = wantToReadItTo.readLine()) != null) {
                String[] inStock = pipe.split("\\|");
                int vin = Integer.parseInt(inStock[0]);
                int year = Integer.parseInt(inStock[1]);
                String make = inStock[2];
                String model = inStock[3];
                String vehicleType = inStock[4];
                String color = inStock[5];
                int odometer = Integer.parseInt(inStock[6]);
                double price = Double.parseDouble(inStock[7]);

                FileWriter InventoryFile = new FileWriter("inventory.csv");
                BufferedWriter InventoryFileData = new BufferedWriter(InventoryFile);

                Vehicle FinalRides = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
            }
            wantToReadItTo.close();
        } catch (IOException e) {
            System.out.println("Error 3113113: File not found" + e.getMessage());
        }
        return FinalCar;
    }
}
