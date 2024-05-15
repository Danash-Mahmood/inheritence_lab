import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

   private  Vehicle vehicle;

    @BeforeEach

    public void setUP(){
        vehicle = new Car("BMW",2000,1,1990,"Petrol",false,5,100,"Black",20_000,10_000);

    }


    @Test

    public void checkGetYearMade(){
        assertThat(vehicle.getYearMade()).isEqualTo(1990);
    }

    @Test

    public void checkGetAge(){
        assertThat(vehicle.getAge()).isEqualTo(34);
    }

    @Test

    public void checkGetFuel(){
        assertThat(vehicle.getTypeOfFuel()).isEqualTo("Petrol");
    }

    @Test

    public void checkGetIsPublicTransport(){
        assertThat(vehicle.getIsPublicTransport()).isEqualTo(false);
    }

    @Test

    public void checkGetMaximumOccupancy(){
        assertThat(vehicle.getMaxOccupancy()).isEqualTo(5);
    }

    @Test

    public void checkGetMaxSpeed(){
        assertThat(vehicle.getMaxSpeed()).isEqualTo(100);
    }

    @Test

    public void checkGetColour(){
        assertThat(vehicle.getColour()).isEqualTo("Black");
    }

    @Test

    public void checkGetPurchasePrice(){
        assertThat(vehicle.getPurchasePrice()).isEqualTo(20_000);
    }

    @Test

    public void checkGetCurrentValue(){
        assertThat(vehicle.getCurrentValue()).isEqualTo(10_000);
    }

    @Test

    public void checkSetCurrentValue(){
        vehicle.setCurrentValue(5_000);
        assertThat(vehicle.getCurrentValue()).isEqualTo(5_000);
    }














}
