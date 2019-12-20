import com.stackroute.pe5.AppearanceOfString;
import org.junit.*;

import static org.junit.Assert.*;

public class AppearanceOfStringTest {
    AppearanceOfString appearanceOfString;

    @Before
    public void setUp() throws Exception {
        appearanceOfString = new AppearanceOfString();
    }

    @After
    public void tearDown() throws Exception {
        appearanceOfString = null;
    }

    @Test
    public void checkAppearance() {
        String expected = "{a : true, b : false, c : true, d : false}";
        String arr[] = {"a", "b", "c", "d", "a", "c", "c"};
        String actual = appearanceOfString.countAppearance(String.join(" ", arr)).replaceAll("=", " : ");
        assertEquals(expected, actual);
    }

    @Test
    public void checkAppearanceNull() {

        String actual = appearanceOfString.countAppearance(null);
        assertNull(actual);

    }
}
