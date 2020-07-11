package exceptions;


import java.io.IOException;
import java.util.Scanner;

public class ExceptionClass {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         while(true){
             int x = Integer.parseInt(sc.nextLine());
             if (x!=0){

                 try {
                     throw new ScannerException("descripton");
                 } catch (ScannerException e) {
                     e.printStackTrace();
                 }finally {
                     sc.close();
                 }

             }
             System.out.println("no exception");
            // sc.close();
         }


    }




}
