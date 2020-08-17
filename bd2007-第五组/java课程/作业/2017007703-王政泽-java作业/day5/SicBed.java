public class SicBed {
    private int floor;
    private int room;
    private int id;

    public SicBed(int floor, int room, int id) {
        this.floor = floor;
        this.room = room;
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
