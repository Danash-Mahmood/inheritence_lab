import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    Bus bus;


    @BeforeEach

    public void setUp(){
        bus = new Bus(true, 2,true,1990,"Petrol",false,5,100,"Black",20_000,10_000);
    }

//    @Test
//    public void checkIsPublic(){
//        System.out.println(bus.isPublicTransport);
//    }

    @Test

    public void checkGetIsBendy(){
        assertThat(bus.getIsBendy()).isEqualTo(true);

    }

    @Test
    public void checkGetNumberFloors(){
        assertThat(bus.getNumberOfFloors()).isEqualTo(2);



    }

    @Test

    public void checkHasWheelChair(){
        assertThat(bus.getWheelChairSpace()).isEqualTo(true);
    }

    @Test

    public void checkDrive(){
        assertThat(bus.drive()).isEqualTo("This bus is driveable - Beep Beep");
    }

    @Test
    public void canWashBus(){
        assertThat(bus.washVehicle()).isEqualTo("Washing your bus takes 2 hours");
    }




}
