import java.util.ArrayList;

public class Hotel {
//i initially thought that
    String hotelName;
    private ArrayList<Room> rooms;
    public int bedroomCapacity;


    public Hotel(String hotelName){
        this.rooms = new ArrayList<>();
        this.hotelName = hotelName;
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
    public void checkInGuest(Guest guest){
        if (getNumberOfBedrooms() < this.bedroomCapacity){
//            declaring a new variable named room which will equal index position 0
            Room room= rooms.get(0);
//            then add a new guest to a room with guest argument.
            room.addGuest(guest);
        }
    }

    public void checkOutGuest(){
        Room room = rooms.get(0);
//        write a remove guest method

        room.removeGuest();
    }



}
