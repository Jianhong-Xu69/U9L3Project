public class PhysicalVolume extends LinkDrive {
    private HardDrive link;

    //Precondition HardDrive is not already linked
    public PhysicalVolume (String uu, String na, HardDrive li) {
        super(uu, na, li.getSize());
        link = li;
        link.setLinked(true);
    }


}
