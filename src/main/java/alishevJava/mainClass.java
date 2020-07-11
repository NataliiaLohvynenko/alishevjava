package alishevJava;

import java.util.ArrayList;
import java.util.List;

import static alishevJava.PracticeEnum.NUMBER1;

public class mainClass {

    public static void main(String[] args) {

        List<String > animal = new ArrayList();
        animal.add("cat");
        animal.add("dog");
        animal.add("frog");

        String s = animal.get(1);

        practiceEnum(NUMBER1);



    }

    public static void practiceEnum(PracticeEnum practiceEnum){
        switch (practiceEnum){
            case NUMBER2:
                System.out.println("Number2");
                break;
            case NUMBER3:
                System.out.println("Number3");
                break;
        }
    }


public static void test(newInt i){
        i.setNumber(5);
}


}
