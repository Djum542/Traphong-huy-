public class Room {
    private static StoredFiles room = new StoredFiles("room.json");
    private String diachi;
    private String sophong;
    private float dientich;
    private float gia;
    private boolean tienich;
    private String yeucauthem;

    public Room(String diachi, String sophong, float dientich, float gia, boolean tienich, String yeucauthem) {
        this.diachi = diachi;
        this.sophong = sophong;
        this.dientich = dientich;
        this.gia = gia;
        this.tienich = tienich;
        this.yeucauthem = yeucauthem;
    }

    public Room() {
        this.diachi = null;
        this.sophong = null;
        this.dientich = 0;
        this.gia = 0;
        this.tienich = false;
        this.yeucauthem = null;
    }

    public String checkTraphong() {
        return sophong;
    }

    public boolean traphong() {
        this.diachi = diachi;
        this.sophong = sophong;
        this.dientich = dientich;
        this.gia = gia;
        this.tienich = tienich;
        this.yeucauthem = yeucauthem;
        return traphong();
    }

    public void setRoom(String diachi, String sophong, float dientich, float gia, boolean tienich, String yeucauthem) {
        this.diachi = diachi;
        this.sophong = sophong;
        this.dientich = dientich;
        this.gia = gia;
        this.tienich = tienich;
        this.yeucauthem = yeucauthem;
        this.sophong = null;
    }

    public static StoredFiles getRoom() {
        return room;
    }

    public String getDiachi() {
        return diachi;
    }

    public float getDientich() {
        return dientich;
    }

    public float getGia() {
        return gia;
    }

    public String getSophong() {
        return sophong;
    }

    public String getYeucauthem() {
        return yeucauthem;
    }

}
