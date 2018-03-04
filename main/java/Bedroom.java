

public class Bedroom extends Room {

    private int roomRate;
    private String roomNumber;
    private String roomType;


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

//    public RoomType getType(){
//        return this.roomType;
//    }

//    public int getTypeFromEnum() {
//        return this.roomType;
//    }


}
