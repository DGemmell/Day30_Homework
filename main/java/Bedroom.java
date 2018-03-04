import java.util.ArrayList;

//this is my subclass bedroom which extends parent class Room.
public class Bedroom extends Room {

    private int roomRate;
    private String roomNumber;
    private String roomType;

//class constructor cmd n with super constructor guest and capacity.
    public Bedroom(String guest, int capacity, int roomRate, String roomNumber, String roomType){
        super(guest, capacity);
        this.roomRate = roomRate;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomRate(){
        return roomRate;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }
//These are the methods i tried to use for enumRoomType.
//    public RoomType getType(){
//        return this.roomType;
//    }

//    public int getTypeFromEnum() {
//        return this.roomType;
//    }


}
