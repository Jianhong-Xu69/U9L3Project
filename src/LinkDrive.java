public class LinkDrive extends Drive{

    private boolean linked;
    public LinkDrive (String uu, String na, int si){
        super(uu, na, si);
        linked = false;
    }

    public void setLinked(boolean li) {
        linked = li;
    }
    public boolean isLinked() {
        return linked;
    }
}
