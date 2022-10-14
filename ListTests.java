import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("Sarah");
        input1.add("b");
        input1.add("Kate");
        input1.add("d");
        List<String> expected = new ArrayList<>();
        expected.add("Sarah");
        expected.add("Kate");
        assertEquals(expected, ListExamples.filter(input1, new ContainsA()));
    }
}


