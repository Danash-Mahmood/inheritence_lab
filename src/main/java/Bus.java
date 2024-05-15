import interfaces.Driveable;

import javax.swing.tree.VariableHeightLayoutCache;

public class Bus extends Vehicle {


    private boolean isBendy;
    private int numberOfFloors;
    private boolean hasWheelChairSpace;

    //how do I set it so you no longer need to input the isPublicTransport parameter

    public Bus(boolean isBendy, int numberOfFloors, boolean hasWheelChairSpace, long yearOfProduction, String typeOfFuel,boolean isPublicTransport,
               int maxOccupancy, int maxSpeed, String colour, double purchasePrice, double currentValue){
        super(yearOfProduction, typeOfFuel, isPublicTransport,
        maxOccupancy, maxSpeed, colour,purchasePrice,currentValue);


        this.isBendy = isBendy;
        this.numberOfFloors = numberOfFloors;
        this.hasWheelChairSpace = hasWheelChairSpace;

        this.isPublicTransport = true;

    }

    public boolean getIsBendy(){
        return this.isBendy;
    }


    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public boolean getWheelChairSpace(){
        return this.hasWheelChairSpace;
    }

    public String drive(){
        return "This bus is driveable - Beep Beep";
    }

    public String washVehicle(){
        return "Washing your bus takes 2 hours";
    }




























}
