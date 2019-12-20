package inheritance;

public class Cat {
    boolean hasClaws;
    double weightInKilos;
    int friendliness;

    public Cat(boolean hasClaws, double weightInKilos, int friendliness) {
        this.hasClaws = hasClaws;
        this.weightInKilos = weightInKilos;
        this.friendliness = friendliness;
    }

    public String  meow() {
        String response;
        if(this.friendliness > 5)
            response = "meow";
         else {
            response = "hiss";
        }
        return response;
    }

    @Override
    public String toString() {
        return String.format("A cat that is %.1f kilos and %d friendly", this.weightInKilos, this.friendliness);
    }

}
