import com.stackroute.pe5.AscendingOrder;
import org.junit.*;

import static org.junit.Assert.*;

public class AscendingOrderTest {
    AscendingOrder ascendingOrder;

    @Before
    public void setUp() throws Exception {
        ascendingOrder = new AscendingOrder();
    }

    public void tearDown() throws Exception {
        ascendingOrder = null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {
        String expected = "[Alice, Bluto, Eugene, Harry, Olive]";
        String actual = ascendingOrder.sortArrayList("Harry Olive Alice Bluto Eugene");
        assertEquals(expected, actual);
    }

    @Test
    public void sortArrayListUsingSortedSetNull() {

        String actual = ascendingOrder.sortArrayList(null);
        assertNull(actual);
    }
}
