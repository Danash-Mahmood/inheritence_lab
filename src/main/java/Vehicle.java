import interfaces.Driveable;

public abstract class Vehicle implements Driveable {


    protected long yearOfProduction;
    protected String typeOfFuel;
    protected boolean isPublicTransport;
    protected int maxOccupancy;
    protected double purchasePrice;
    protected double currentValue;
    protected String colour;
    protected int maxSpeed;
    protected int numberOfPassengers;

    protected int age;


    public Vehicle(long yearOfProduction, String typeOfFuel, boolean isPublicTransport,
                   int maxOccupancy, int maxSpeed, String colour, double purchasePrice, double currentValue) {

        this.yearOfProduction = yearOfProduction;
        this.age = (int) (2024-yearOfProduction);
        this.typeOfFuel = typeOfFuel;
        this.isPublicTransport = isPublicTransport;
        this.maxOccupancy = maxOccupancy;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.purchasePrice = purchasePrice;
        this.currentValue = currentValue;
        this.numberOfPassengers = 0;





    }

    public long getYearMade(){
        return this.yearOfProduction;
    }
    public int getAge(){
        return this.age;
    }

    public String getTypeOfFuel(){
        return this.typeOfFuel;
    }

    public boolean getIsPublicTransport(){
        return this.isPublicTransport;
    }

    public int getMaxOccupancy(){
        return this.maxOccupancy;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public String getColour(){
        return this.colour;

    }

    public double getPurchasePrice(){
        return this.purchasePrice;
    }

    public double getCurrentValue(){
        return this.currentValue;
    }

    public void setCurrentValue(int newValue){
        this.currentValue = newValue;
    }

    public int getNumberOfPassengers(){
        return this.numberOfPassengers;
    }



    public void  addPassenger() {
        if (this.numberOfPassengers < this.maxOccupancy) {
            this.numberOfPassengers++;

        }
    }

    public abstract String washVehicle();














}
