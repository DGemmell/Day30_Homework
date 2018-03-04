public abstract class Room {
//This is my abstract class Room which will extend to bedroom, conf room and dining room classes.

    String guest;
    int capacity;


    public Room(String guest, int capacity){
        this.guest = guest;
        this.capacity = capacity;
    }


    public String getGuest(){
        return guest;
    }

    public void setGuest(String guest){
        this.guest = guest;
    }

    public int getCapacity(){
        return capacity;
    }

}
