package main.samples.inheritance;

/**
 * Created by bond on 23/01/2017.
 */
public class InheritanceMainClass {
    public static void main(String[] args) {
        InheritanceMainClass mainClass = new InheritanceMainClass();
        Dog dog =  mainClass.new Dog();
        dog.bark();
        dog.eat("bone");
        Bird bird = new Bird();
        bird.move();
        bird.eat("worm");
        System.out.println(bird);
    }

    public class Dog extends AbstractAnimalClass{
        @Override
        public void eat(String food) {
            System.out.println("eating "+food);
        }

        @Override
        public void move() {
            System.out.println("Walking....");
        }

        public void bark(){
            System.out.println("Barking....");
        }
    }
}
