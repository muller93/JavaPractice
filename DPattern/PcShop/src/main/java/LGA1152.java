public class LGA1152 implements MoBo {
    String standard;

    public LGA1152(String sockets) {
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
