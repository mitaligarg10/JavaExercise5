import com.stackroute.pe5.EmptyArrayList;
import org.junit.*;

import static org.junit.Assert.*;

public class EmptyArrayListTest {
    EmptyArrayList emptyArrayList;

    @Before
    public void setUp() throws Exception {
        emptyArrayList = new EmptyArrayList();
    }

    @After
    public void tearDown() throws Exception {
        emptyArrayList = null;
    }

    @Test
    public void addArray() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        String actual = emptyArrayList.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected, actual);
    }

    @Test
    public void update() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        emptyArrayList.addArray("Apple Grape Melon Berry".split(" "));
        emptyArrayList.update(0, "Kiwi");
        String actual = emptyArrayList.update(2, "Mango").toString();
        assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        String expected = "[]";
        emptyArrayList.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual = emptyArrayList.removeAll().toString();
        assertEquals(expected, actual);
    }
}
