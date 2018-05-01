public class AM4 implements MoBo {
    String standard;

    public AM4(String sockets) {
        this.standard = sockets;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public String getSocket() {
        return standard;
    }
}
