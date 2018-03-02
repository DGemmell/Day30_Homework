import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("Debbie Gemmell",100, 90.00, "P1","Penthouse");

    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, bedroom.capacity);
    }

    @Test
    public void canGetGuest(){
        assertEquals("Debbie Gemmell", bedroom.guest);
    }

    @Test
    public void canGetRoomRate(){
        assertEquals(90.00, bedroom.getRoomRate());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("P1", bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Penthouse", bedroom.getRoomType());
    }
}
