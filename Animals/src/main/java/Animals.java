public abstract class Animals {

    private String name;
    private int eaten;
    private int power;

    public Animals(String name) {
        this.name = name;
        this.eaten = 100;
        this.power = 0;
    }

    public String makeSound(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEaten() {
        return eaten;
    }

    public void setEaten(int eaten) {
        this.eaten = eaten;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
