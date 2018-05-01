public abstract class PcShop {
    private String address;

    public PcShop(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract CPU getCPU();
    public abstract MoBo getMoBo();

}
