import com.stackroute.pe5.Student;
import com.stackroute.pe5.StudentSorter;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class MainTest {

    StudentSorter studentSorter;

    @Before
    public void setUp() throws Exception {
        studentSorter = new StudentSorter();
    }

    @After
    public void tearDown() throws Exception {
        studentSorter = null;
    }

    public String toString(List<Student> ls) {
        String str = "";
        for (Student s : ls) {
            str += s.toString();
        }
        return str;
    }

    @Test
    public void getSortedList_CorrectOutput() {
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(22, 12, "Mitali"));
        myList.add(new Student(22, 13, "Anam"));
        myList.add(new Student(25, 14, "Himani"));
        myList.add(new Student(22, 15, "Mitali"));
        myList.add(new Student(22, 16, "Kashika"));

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(25, 14, "Himani"));
        expectedList.add(new Student(22, 13, "Anam"));
        expectedList.add(new Student(22, 16, "Kashika"));
        expectedList.add(new Student(22, 12, "Mitali"));
        expectedList.add(new Student(22, 15, "Mitali"));
        assertEquals(toString(expectedList), toString(studentSorter.getSortedList(myList)));
    }

    @Test
    public void getSortedList_CorrectOutputFailure() {
        List<Student> myList = new ArrayList<>();
        myList.add(new Student(25, 12, "Mitali"));
        myList.add(new Student(22, 13, "Anam"));
        myList.add(new Student(25, 14, "Himani"));
        myList.add(new Student(25, 15, "Mitali"));
        myList.add(new Student(24, 16, "Kashika"));

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student(25, 14, "Himani"));
        expectedList.add(new Student(22, 13, "Anam"));
        expectedList.add(new Student(25, 12, "Mitali"));
        expectedList.add(new Student(25, 15, "Mitali"));
        expectedList.add(new Student(24, 17, "Kashika"));
        assertNotEquals(toString(expectedList), toString(studentSorter.getSortedList(myList)));
    }
}
