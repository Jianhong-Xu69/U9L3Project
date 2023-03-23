public class VolumeGroup extends Drive{
    private PhysicalVolume[] pvList;
    private LogicalVolumes[] lvList;

    public VolumeGroup (String uu, String na, PhysicalVolume pv){
        super(uu, na, pv.getSize());
    }
}
