import java.util.ArrayList;

public abstract class Room {
//This is my abstract class Room which will extend to bedroom, conf room and dining room classes.

    String guest;
    int capacity;


//this is my instructor class with the variables that are specific to class Room.
    public Room(String guest, int capacity){
        this.guest = guest;
        this.capacity = capacity;
    }

//methods getGuest.  I changed guest in the room class to be an arraylist from being a string, i hope this is ok.
    public String getGuest(){
        return guest;
    }

//    this method is so we can change the guests name and passing in the argument guest.
    public void setGuest(){
        this.guest = guest;
    }

//    this method is the get the capacity.
    public int getCapacity(){
        return capacity;
    }

}
