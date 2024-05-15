import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setRemoveAssertJRelatedElementsFromStackTrace;

public class CarTest {


    private Car car;

    @BeforeEach

    public void setUp(){
        car = new Car("Ferrari",3450,2,1990,"Petrol",false,2,100,"Black",20_000,10_000);
    }

    @Test

    public void checkGetCarBrand(){
        assertThat(car.getCarBrand()).isEqualTo("Ferrari");
    }

    @Test

    public void checkGetMileage(){
        assertThat(car.getMileage()).isEqualTo(3450);
    }

    @Test

    public void checkSetMileage(){
        car.setMileage(5000);
        assertThat(car.getMileage()).isEqualTo(5000);
    }

    @Test
    public void checkGetPreviousOwners(){
        assertThat(car.getNumberOfPreviousOwners()).isEqualTo(2);
    }

    @Test

    public void checkSetPreviousOwners(){
        car.setNumberOfPreviousOwners(3);
        assertThat(car.getNumberOfPreviousOwners()).isEqualTo(3);

    }
    @Test
    public void checkSetTurbo(){
        car.setAddSpeed(5);
        assertThat(car.getMaxSpeed()).isEqualTo(105);
    }

    @Test
    public void checkOverideGeTColour(){
        assertThat(car.getColour()).isEqualTo("The Ferrari is the colour Black");
    }

    @Test

    public void canDrive(){
        assertThat(car.drive()).isEqualTo("This car can be driven - Vroom Vroom");
    }

    @Test

    public void canDriveOverload(){
        assertThat(car.drive(car.getCarBrand())).isEqualTo("This Ferrari can be driven - Vroom Vroom");
    }

    @Test

    public void canReplaceEngine(){
        assertThat(car.replaceEngine("V8")).isEqualTo("Your car now has a V8 engine");
    }

    @Test

    public void canAddPassengerCar(){
        car.addPassenger();
        //System.out.println(car.getNumberOfPassengers());
        car.addPassenger();
        //System.out.println(car.getNumberOfPassengers());

        assertThat(car.getNumberOfPassengers()).isEqualTo(2);
    }

    @Test

    public void canWashCar(){
        assertThat(car.washVehicle()).isEqualTo("Washing your Ferrari takes 15 mins");
    }

    @Test

    public void checkGetCurrentValue(){
        assertThat(car.getCurrentValue()).isEqualTo(10_000);
    }









}
