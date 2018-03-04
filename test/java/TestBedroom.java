import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom;
//    Bedroom singleRoom;
//    Bedroom doubleRoom;
//    Bedroom familyRoom;
//    Bedroom suiteRoom;
//    Bedroom penthouseRoom;
//    Bedroom cottageRoom;

    @Before
    public void before(){
//        singleRoom = new Bedroom(RoomType.SINGLE.getCapacity());
//        doubleRoom = new Bedroom(RoomType.DOUBLE.getCapacity());
//        familyRoom = new Bedroom(RoomType.FAMILY.getCapacity());
//        suiteRoom = new Bedroom(RoomType.SUITE.getCapacity());
//        penthouseRoom = new Bedroom(RoomType.PENTHOUSE.getCapacity());
//        cottageRoom = new Bedroom(RoomType.COTTAGE.getCapacity());
        bedroom = new Bedroom("Debbie Gemmell",100, 90, "P1","Penthouse");

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
        assertEquals(90, bedroom.getRoomRate());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("P1", bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Penthouse", bedroom.getRoomType());
    }

//    @Test
//    public void canGetFamilyCapacity(){
//        assertEquals(5, familyRoom);
//    }
}
