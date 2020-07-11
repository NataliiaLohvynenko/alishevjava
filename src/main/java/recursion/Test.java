package recursion;

public class Test {
    public static void main(String[] args) {


        int fact = 4;
        int i = 1;
        int result = 1;

        fact(fact, fact, result);
    }

    private static void fact(int fact, int i, int result) {


        System.out.println("result: " + result + " fact " + fact + " i " + i);
        result = i * fact;
        fact--;
        i = result;
        if (fact == 0) {
            System.out.println(result);
            return;
        }
        fact(fact,i,result);
    }

    //4 = 4*3*2*1
    //

    private static int counter(int n, int i, int sum, int fib) {
        System.out.println("sum "+ sum + "n " + n + " i " + i + " fib " + fib);

        sum=n+i;//n = 5 , i = 3
        n=i;//i5 n=5
        i=sum;

        fib--;


        if (fib==2) {
            System.out.println(sum);
            return sum;
        }
        counter(n,i, sum, fib);
        return sum;
    }

}
