public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE(5),
    PENTHOUSE(2),
    COTTAGE(6);

    private int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}
