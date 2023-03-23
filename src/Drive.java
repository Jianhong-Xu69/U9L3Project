public class Drive {
    private String uuid;
    private String name;
    private int size;

    public Drive (String uu, String na, int si){
        uuid = uu;
        name = na;
        size = si;
    }

    public String getUuid() {
        return uuid;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
}