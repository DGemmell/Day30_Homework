import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Code Clan", 200, "The Muirend Suite",500);
    }

    @Test
    public void canGetConfRoomRate(){
        assertEquals(500, conferenceRoom.getConfRoomRate());
    }

    @Test
    public void canGetConfRoomName(){
        assertEquals("The Muirend Suite", conferenceRoom.getConfRoomName());
    }


}
