package main.samples.inheritance;

/**
 * Created by bond on 23/01/2017.
 */
abstract public class AbstractAnimalClass {
    protected boolean isPet;
    protected String owner;

    abstract public void eat(String food);

    abstract public void move();

    public void sleep(){
        System.out.println("Sleeping .....");
    }


}
