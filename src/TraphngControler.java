import java.util.List;

import com.google.gson.JsonArray;

public class TraphngControler {
    private Room room;

    public TraphngControler(Room room) {
        this.room = room;
    }

    public JsonArray roomValid(String sophong) {
        JsonArray tempMeMory = Room.getRoom().getAll();
        int index = -1;
        index = Room.getRoom().search("NU", sophong);
        if (sophong.equals(this.room.getSophong())) {
            System.out.println("[Tra phong] tra phong thanh công");
        } else if (this.room.getSophong() == null && this.room.getSophong().equals(sophong)) {
            System.out.println("[KHONG THUE] BẠN CHƯA CÓ THUÊ PHÒNG");
        }
        return tempMeMory;

    }

    public void traphong(String sophong) {
        JsonArray list;
        list = roomValid(sophong);
        if (list.get(0) != null) {
            System.out.println(list.get(1));
        }
    }

    public Room getRoom() {
        return room;
    }
}
