import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;


    @Before
    public void before(){
        hotel = new Hotel("Code Clan Towers", 100);

        };


    @Test
    public void canGetBedroomCapacity(){
        assertEquals(100, hotel.bedroomCapacity);
    }


//    @Test
//    public void canCheckInGuest(){
//        hotel.checkInGuest(rooms);
//        hotel.checkOutGuest(rooms);
//        assertEquals(0, hotel.bedroomCapacity);
//    }

}
