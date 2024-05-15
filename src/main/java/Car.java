import interfaces.Driveable;




public class Car extends Vehicle {
    
    private String carBrand;
    private int mileage;
    private int numberOfPreviousOwners;


    public Car(String carBrand,int mileage,int numberOfPreviousOwners,long yearOfProduction, String typeOfFuel, boolean isPublicTransport,
               int maxOccupancy, int maxSpeed, String colour, double purchasePrice, double currentValue){
        super(yearOfProduction,typeOfFuel,isPublicTransport,maxOccupancy,maxSpeed,colour,purchasePrice,currentValue);
        this.carBrand = carBrand;
        this.mileage = mileage;
        this.numberOfPreviousOwners = numberOfPreviousOwners;

    }

    public String getCarBrand(){
        return this.carBrand;
    }

    public int getMileage(){
        return this.mileage;
    }

    public void setMileage(int newMileage){
        this.mileage = newMileage;
    }

    public int getNumberOfPreviousOwners(){
        return this.numberOfPreviousOwners;
    }

    public void setNumberOfPreviousOwners(int newPreviousOwnersAmount){
        this.numberOfPreviousOwners = newPreviousOwnersAmount;
    }

    public void setAddSpeed(int addedSpeed){
        this.maxSpeed += addedSpeed;
    }

    @Override

    public String getColour(){

        return "The " + this.carBrand +" is the colour " +this.colour;

    }

    public String drive(){
        return "This car can be driven - Vroom Vroom";
    }

    public String drive(String carBrand){ //overloading the drive method
        return "This " + carBrand + " can be driven - Vroom Vroom";
    }

    public String replaceEngine(String engineType){
        return "Your car now has a " + engineType + " engine";
    }

    public String washVehicle(){
        return "Washing your " + carBrand +" takes 15 mins";
    }




























}
