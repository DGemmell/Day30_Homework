import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String confRoomName;
    private int confRoomRate;

//class constructor for conference room with super guest and capacity.
    public ConferenceRoom(String guest, int capacity, String confRoomName, int confRoomRate) {
        super(capacity);
        this.confRoomName = confRoomName;
        this.confRoomRate = confRoomRate;
    }

    public String getConfRoomName(){
        return confRoomName;
    }

    public int getConfRoomRate(){
        return confRoomRate;
    }

}

