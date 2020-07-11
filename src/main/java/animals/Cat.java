package animals;

public class Cat extends Anima{

     String name = "Cat";

    public Cat() {
        super.name = name;

    }

    @Override
    public void say() {
        System.out.println("Meau");
    }

}
