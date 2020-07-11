import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import testing.Vector2D;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }


    @Test
    public void shouldHaveZeroLength() {
        Assert.assertEquals(0.0, v1.length(), EPS);
    }

    @Test
    public void newClassShouldHaveNewZeroXAndNewZeroY(){
        Assert.assertEquals(0, v1.getY(),  EPS);
        Assert.assertEquals(0, v1.getX(),  EPS);
    }
}
