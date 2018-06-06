public class Bear extends ContinentalAnimals implements Hunter {
    public Bear(String name) {
        super(name);
        setNumOfLegs(4);
    }

    @Override
    public void eat(Animals who) {
        System.out.println(this.getName() + "Eat a man");
        setEaten(70);
    }

    @Override
    public void resting(int howMany) {

    }
}
