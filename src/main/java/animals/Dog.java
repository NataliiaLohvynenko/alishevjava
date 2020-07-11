package animals;

public class Dog extends Anima {
    String name = "Dog";

    public Dog() {
        super.name = name;
    }

    @Override
    public void say(){
        System.out.println("bark");
    }
}
