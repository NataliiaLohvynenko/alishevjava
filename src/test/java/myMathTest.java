import org.junit.Test;
import testing.myMath;

public class myMathTest {
    @Test(expected = ArithmeticException.class)
    public void ZeroDenominatorshouldThowExceprion(){
        myMath.devide(1,0);
    }
}
