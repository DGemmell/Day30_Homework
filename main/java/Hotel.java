import java.util.ArrayList;

public class Hotel {
//i initially thought that
    String hotelName;
    private ArrayList<Guest> guestNames;
    private ArrayList<Room> rooms;
    public int bedroomCapacity;


    public Hotel(String hotelName, int bedroomCapacity){
        this.guestNames = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.hotelName = hotelName;
        this.bedroomCapacity = bedroomCapacity;
    }

    public String gethotelName(){
        return hotelName;
    }

    public void setHotelName(String HotelName) {
        this.hotelName =  hotelName;
    }

    public int getNumberOfBedrooms(){
        return rooms.size();
    }

//  I think i have this wrong but this was my thinking.
//    1.Check in a new guest into room.
//    2.If the number of rooms is less than capacity then add a new guest using the rooms arraylist(name and capacity)
    public void checkInGuest(Room guest){
        if (getNumberOfBedrooms() < this.bedroomCapacity){
            rooms.add(guest);
        }
    }

    public Room checkOutGuest(){
        return rooms.remove(0);
    }



}
