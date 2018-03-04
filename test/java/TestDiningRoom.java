import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Gemmell Family", 100);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, diningRoom.capacity);
    }

    @Test
    public void canGetGuest(){
        assertEquals("Gemmell Family", diningRoom.guest);
    }

}
