public class Dog extends Animal {
    // child class that inherits from the abstract class Animal
    public int bark() {
        System.out.println("This dog barks. It is " + age + " years old.");
        return age;
    }

    public void move() {
        System.out.println("This dog runs forward.");
    }

    public void sleep(){

    }

    // creating switch case based on which enum value is passed through it

    public void furColor(FurColor fur){
        switch (fur) {
            case BLACK:
                System.out.println(FurColor.BLACK.coolFactor);
            case GREY:
                System.out.println(FurColor.GREY.coolFactor);
            case WHITE:
                System.out.println(FurColor.WHITE.coolFactor);

        }
    }
}
