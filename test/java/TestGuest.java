import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Bobby Day", 07725005543);
    }

    @Test
    public void canGetGuestContact(){
        assertEquals(07725005543, guest.guestContact);
    }
}
