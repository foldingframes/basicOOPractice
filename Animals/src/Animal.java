public abstract class Animal {
    int name;
    int age;

    public int setAge(int animalAge){
        this.age = animalAge;
        return age;
    }

    public abstract void move();

    public abstract void sleep();
}