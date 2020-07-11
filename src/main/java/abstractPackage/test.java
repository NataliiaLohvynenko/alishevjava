package abstractPackage;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);


    }
}
