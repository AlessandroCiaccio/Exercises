import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {
    Calculator testing = new Calculator();

    @Test
    public void media() {
        Float result = 10F;
        Float test = testing.media(5.5F, 10F, 14.5F);
        Assert.assertEquals(result, test);
    }

    @Test
    public void media_first_value_null() {
        Float test = testing.media(null, 12F, 12F);
        Assert.assertNull(null, test);
    }

    @Test
    public void media_second_value_null() {
        Float test = testing.media(12F, null, 12F);
        Assert.assertNull(null, test);
    }

    @Test
    public void media_third_value_null() {
        Float test = testing.media(12F, 12F, null);
        Assert.assertNull(null, test);
    }
}