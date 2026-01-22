public class Bee extends Animal implements Insect {
    // methods from the interface class Insect

    public void fly() {
        System.out.println("The bee is able to fly, despite how fat and round it is, and has " + legs + " legs.");
    }

    public void bite() {
        System.out.println("The bee is not able to bite, but instead has a stinger it can use. It has " + legs + " legs.");
    }
    // methods from the abstract class Animal

    public void move() {
        System.out.println("The bee moves from place to place to gather honey, passing around pollen along the way.");
    }

    public void sleep() {
        System.out.println("Yes, even bees sleep.");
    }

}
