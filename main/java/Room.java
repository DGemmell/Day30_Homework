public abstract class Room {

    String guest;
    int capacity;


    public Room(String guest, int capacity){
        this.guest = guest;
        this.capacity = capacity;
    }


    public String getGuest(){
        return guest;
    }

    public int getCapacity(){
        return capacity;
    }

}
