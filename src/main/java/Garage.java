import interfaces.Driveable;

import java.util.ArrayList;


public class Garage {

    private ArrayList<Vehicle> garage;
    private int numberOfSpaces;


    public Garage(int numberOfSpaces){

        this.garage = new ArrayList<>();

        this.numberOfSpaces = numberOfSpaces;






    }


    public void  addVehicleToGarage(Vehicle vehicle) {
        int currentSpace = this.numberOfSpaces - this.garage.size();
        if (currentSpace > 0) {

            this.garage.add(vehicle);

        }




    }


    public void removeVehicleFromGarage(Vehicle vehicle){
        this.garage.remove(vehicle);
    }

    public int countVehiclesInGarage(){
        return this.garage.size();
    }

    public int currentSpaceInGarage(){

        return this.numberOfSpaces;

    }

    public double currentValueOfGarage(){
        double sum =0;
        for (Vehicle vehicle : this.garage){
            sum +=  vehicle.getCurrentValue();
            System.out.println(sum);

        }
        System.out.println(sum);
        return sum;
    }

    public double totalGarageDepreication(){
       double  totalPurchasePrice = 0;
       double totalCurrentValue = 0;

        for (Vehicle vehicle:this.garage){
            if (vehicle.getPurchasePrice() ==0 ){
                return 0;
            }
            if (vehicle.getPurchasePrice() > vehicle.getCurrentValue()){
                totalPurchasePrice += vehicle.getPurchasePrice();
                totalCurrentValue += vehicle.getCurrentValue();

            }


        }

        return ((totalPurchasePrice-totalCurrentValue)/totalPurchasePrice )*100;
    }










}
