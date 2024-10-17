import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {
    @Test
    public void testRight() {
        Cal cal = new Cal();
        assertEquals(cal.Add(1, 2), 3);
        System.out.println("pr2");
    }



}
