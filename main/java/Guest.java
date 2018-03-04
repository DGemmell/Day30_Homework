public class Guest {
//guest is a seperate class.
//    initially i had just used a guest contact as i thought the class room would have the guest name.
//    im not sure of this will cause some duplication.
    String guestName;
    int guestContact;


    public Guest(String guestName, int guestContact){
        this.guestName = guestName;
        this.guestContact = guestContact;
    }

    public String getGuestName(){
        return guestName;
    }

    public int getGuestContact(){
        return guestContact;
    }
}
