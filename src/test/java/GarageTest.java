import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {


    Garage garage;
    Car ferrari;

    @BeforeEach

    public void setUp(){
        garage = new Garage(5);
        ferrari = new Car("Ferrari",3450,2,1990,"Petrol",false,5,100,"Black",20000,10000);
    }


    @Test

    public void checkAddVehicleToGarage(){
        garage.addVehicleToGarage(ferrari);
        assertThat(garage.countVehiclesInGarage()).isEqualTo(0);





    }

    @Test

    public void removeVehicleFromGarage(){
        garage.addVehicleToGarage(ferrari);
        garage.removeVehicleFromGarage(ferrari);
        assertThat(garage.countVehiclesInGarage()).isEqualTo(0);

    }

    @Test

    public void checkCurrentValueSum(){
        garage.addVehicleToGarage(ferrari);
        assertThat(garage.currentValueOfGarage()).isEqualTo(10000);

    }

    @Test

    public void checkDepreication(){
        garage.addVehicleToGarage(ferrari);
        assertThat(garage.totalGarageDepreication()).isEqualTo(50);
    }












}
