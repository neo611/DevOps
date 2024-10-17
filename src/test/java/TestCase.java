import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {
    @Test
    public void testRight() {
        Cal cal = new Cal();
        assertEquals(cal.Add(1, 2), 4);
        System.out.println("success");
    }



}
