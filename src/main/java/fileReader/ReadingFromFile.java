package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args)  {


        String path = "src/main/resources/test";
        File file = new File(path);

        List<String> arrayString = new ArrayList<>();

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
           arrayString.add(sc.nextLine());


            /* String[] numbersString = line.split(" ");
            System.out.println(Arrays.toString(numbersString));

            int[] numbers = new int[3];
            int counter = 0;


            for (String number: numbersString) {
               numbers[counter++] = Integer.parseInt(number);
            }

            System.out.println(Arrays.toString(numbers));*/
            
        }
        for (String s:arrayString) {
            System.out.println(s);

        }
    }

}
