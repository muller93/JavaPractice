public class IntelShop extends PcShop {
    public IntelShop(String address) {
        super(address);
    }

    @Override
    public CPU getCPU() {
        return new Intel5I(3200, 4);
    }

    @Override
    public MoBo getMoBo() {
        return new LGA1152("ATX");
    }
}
