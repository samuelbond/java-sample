package main.samples.inheritance;

/**
 * Created by bond on 23/01/2017.
 */
public class Bird extends AbstractAnimalClass {

    @Override
    public String toString() {
        return "I am a Bird";
    }

    @Override
    public void eat(String food) {
        System.out.println("eating "+food);
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }
}
