package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {


        String path = "src/main/resources/test1";
        File fileTarget = new File(path);
        File fileSource = new File("src/main/resources/test");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(fileTarget);
        while(sc.hasNextLine()){

            String n = sc.nextLine();
            pw.print(n);
        }


    }
}
