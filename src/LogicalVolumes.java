public class LogicalVolumes extends Drive{

    private VolumeGroup associated;
    //Precondition VolumeGroup has space
    public LogicalVolumes (String uu, String na, int si, VolumeGroup vg){
        super(uu, na, si);
        associated = vg;
    }
}
