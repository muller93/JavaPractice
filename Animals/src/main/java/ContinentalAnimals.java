public class ContinentalAnimals extends Animals {
    public ContinentalAnimals(String name) {
        super(name);
    }

    private int numOfLegs;

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
