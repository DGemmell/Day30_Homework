

public class Bedroom extends Room {

    private Double roomRate;
    private String roomNumber;
    private String roomType;

    public Bedroom(String guest, int capacity, Double roomRate, String roomNumber, String roomType) {
        super(guest, capacity);
        this.roomRate = roomRate;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public double getRoomRate(){
        return roomRate;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }
}
