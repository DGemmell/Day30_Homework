import java.util.ArrayList;

public abstract class Room {
//This is my abstract class Room which will extend to bedroom, conf room and dining room classes.

    ArrayList<Guest> guests;
    int capacity;


//this is my instructor class with the variables that are specific to class Room.
    public Room(int capacity){
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

//methods getGuest.  I changed guest in the room class to be an arraylist from being a string, i hope this is ok.
    public ArrayList<Guest> getGuest(){
        return guests;
    }


//    this method is the get the capacity.
    public int getCapacity(){
        return capacity;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(){
            this.guests.remove(0);}


}
