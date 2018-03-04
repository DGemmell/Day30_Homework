public class ConferenceRoom extends Room {

    private String confRoomName;
    private int confRoomRate;

    public ConferenceRoom(String guest, int capacity, String confRoomName, int confRoomRate) {
        super(guest, capacity);
        this.confRoomName = confRoomName;
        this.confRoomRate = confRoomRate;
    }

    public String getconfRoomName(){
        return confRoomName;
    }

    public int getconfRoomRate(){
        return confRoomRate;
    }

}

