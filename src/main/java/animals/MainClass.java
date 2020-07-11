package animals;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Anima> animas = new ArrayList<>();

        Dog dog = new Dog();
        animas.add(dog);
        animas.add(new Cat());

        List<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        dogs.get(1).go();



        test(animas);
        test(dogs);


    }

    private static void test(List<? extends Anima> animas){
        for (Anima a: animas
             ) {
            System.out.println(a);
            
        }

    }
}
