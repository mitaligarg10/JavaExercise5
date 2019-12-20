import com.stackroute.pe5.NumOfCount;
import org.junit.*;

import static org.junit.Assert.*;

public class NumofCountTest {
    NumOfCount numOfCount;

    @Before
    public void setUp() throws Exception {
        numOfCount = new NumOfCount();
    }

    @After
    public void tearDown() throws Exception {
        numOfCount = null;
    }

    @Test
    public void checkFrequency() {
        String expected = "{one=5, two=2, three=2}";
        String actual = numOfCount.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected, actual);
    }

    @Test
    public void checkFrequencyNull() {

        String actual = numOfCount.checkFrequency(null);
        assertNull(actual);
    }

    @Test
    public void checkFrequencyNotNull() {

        String actual = numOfCount.checkFrequency("Hello! hey there.");
        assertNotNull(actual);
    }
}
