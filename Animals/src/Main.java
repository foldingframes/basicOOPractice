public class Main {
    public static void main(String[] args) {
        // creating new objects
        Dog dg = new Dog();
        Cheetah ch = new Cheetah();
        // using setAge() method declared in Dog Class to add value for dg object instance
        dg.setAge(14);

        // object method executions
        dg.move();
        dg.bark();
        ch.move();
        ch.sleep();
        // method chaining to add multiple modifications to a variable in one line
        String name = "youtube ";
        name = name.concat("channel        ").toUpperCase().trim();

        System.out.println(name);
        // creating object from Bee class, which inherits from the Insect interface

        Bee b = new Bee();
        // executing methods from Bee class (note that the "legs" variable already has a value in Insect interface)
        b.fly();
        b.bite();
        // executing methods that come from the Animal class
        b.move();
        b.sleep();
        // implementing enum value from FurColor

        System.out.println("a red pelt on an animal, " + FurColor.RED.coolFactor);

        Dog df = new Dog();

        System.out.println("Switch case results:\n");

        df.furColor(FurColor.BLACK);
        df.furColor(FurColor.GREY);
        df.furColor(FurColor.WHITE);

    }
}

