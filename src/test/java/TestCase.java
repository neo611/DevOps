import org.junit.Test;
import static org.junit.Assert.*;


// 勾选setting 中的allow auto-merge
public class TestCase {
    @Test
    public void testRight() {
        Cal cal = new Cal();
        assertEquals(cal.Add(1, 2), 3);
        System.out.println("pr1243");
    }



}
