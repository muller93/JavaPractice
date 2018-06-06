public class Chicken extends ContinentalAnimals implements  Vegetarian {
    public Chicken(String name) {
        super(name);
        setNumOfLegs(2);
    }

    @Override
    public void eating() {
        System.out.println(this.getName() + "eaten");
        this.setEaten(100);
    }

    @Override
    public String makeSound() {
        return "kott";
    }
}
