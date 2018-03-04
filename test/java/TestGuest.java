import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("bobgemmell@hotmail.co.uk 07725005543");
    }

    @Test
    public void canGetGuestContact(){
        assertEquals("bobgemmell@hotmail.co.uk 07725005543", guest.guestContact);
    }
}
