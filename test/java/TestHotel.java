import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Room rooms;


    @Before
    public void before(){
        hotel = new Hotel("Code Clan Towers", 100);
        rooms = new Room("linda McGinlay", 2) {
        };
    }

    @Test
    public void canGetBedroomCapacity(){
        assertEquals(100, hotel.bedroomCapacity);
    }


    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(rooms);
        hotel.checkOutGuest(Hotel);
        assertEquals(0, hotel.bedroomCapacity);
    }

}
