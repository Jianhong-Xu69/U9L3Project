public class PhysicalVolume extends Drive {
    private PhysicalDrive linked;

    public PhysicalVolume (String uu, String na, PhysicalDrive li) {
        super(uu, na, li.getSize());
        linked = li;
    }
}
