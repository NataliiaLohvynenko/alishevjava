package testing;

public class NetworkUtils {

    public  static void getConnection(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }


    @Override
    public String toString() {
        return "NetworkUtils{}";
    }
}
