package collections;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberInArray {
    public static void main(String[] args) {



        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};


        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < a.length; i++){
            int counter = 0;
            if(!al.contains(a[i])){
                al.add(a[i]);
                for(int j = i;j<a.length;j++){
                    if(a[i]==a[j]){
                        counter++;
                    }
                }
                System.out.println(a[i] +"is found" + counter +"\n");
            }

        }

    }
}
