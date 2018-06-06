public class Fish extends WaterAnimals implements Vegetarian {
    public Fish(String name) {
        super(name);

    }

    @Override
    public void eating() {
        System.out.println(getName() + "eaten a little bit");
        setEaten(30);
    }
}
