import com.stackroute.pe5.ModifyMapKeyVal;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class ModifyMapKeyValTest {
    ModifyMapKeyVal modifyMapKeyVal;

    @Before
    public void setUp() {
        modifyMapKeyVal = new ModifyMapKeyVal();
    }

    @After
    public void tearDown() {
        modifyMapKeyVal = null;
    }

    @Test
    public void rotateValue() {
        String expected = "{val2=java, val1= }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        String actual = modifyMapKeyVal.rotateValue(map);
        assertEquals(expected, actual);
    }

    @Test
    public void rotateValueSecond() {
        String expected = "{val2=mars, val1= }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "mars");
        map.put("val2", "saturn");
        String actual = modifyMapKeyVal.rotateValue(map);
        assertEquals(expected, actual);
    }

    @Test
    public void rotateValueNull() {

        String actual = modifyMapKeyVal.rotateValue(null);
        assertNull(actual);
    }
}
