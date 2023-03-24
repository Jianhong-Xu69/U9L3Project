import java.util.ArrayList;
public class VolumeGroup extends Drive{
    private ArrayList<PhysicalVolume> pvList;
    private ArrayList<LogicalVolumes> lvList;
    private int occupiedSpace;
    //Precondition PhysicalVolume is not already linked
    public VolumeGroup (String uu, String na, PhysicalVolume pv){
        super(uu, na, pv.getSize());
        pvList = new ArrayList<PhysicalVolume>();
        pvList.add(pv);
        lvList = new ArrayList<LogicalVolumes>();
        occupiedSpace = 0;
    }

    public void addPV(PhysicalVolume pv){
        pvList.add(pv);
        int temp = 0;
        for (PhysicalVolume phys : pvList) {
            temp += phys.getSize();
        }
        super.setSize(temp);
    }

    //Precondition LogicalVolume can fit
    public void addLV(LogicalVolumes lv){
        lvList.add(lv);
        int temp = 0;
        for (LogicalVolumes logi : lvList) {
            temp += logi.getSize();
        }
        occupiedSpace = temp;
    }

    public int getFreeSpace() {
        return super.getSize()-occupiedSpace;
    }
}