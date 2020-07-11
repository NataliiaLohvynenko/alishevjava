import org.junit.Test;
import testing.NetworkUtils;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
