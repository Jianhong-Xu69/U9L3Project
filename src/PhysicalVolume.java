public class PhysicalVolume extends LinkDrive {
    private HardDrive link;

    //Precondition HardDrive is not already linked
    public PhysicalVolume (String uu, String na, HardDrive li) {
        super(uu, na, li.getSize());
        link = li;
        link.setLinked(true);
    }

    @Override
    public String toString() {
        return super.getName() + ":[" + super.getSize() + "G] [" + super.getUuid() + "]";
    }
}
