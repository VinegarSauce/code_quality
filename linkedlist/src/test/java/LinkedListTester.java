import static org.junit.Assert.*;
import org.junit.Test;
import LinkedList.*;

public class LinkedListTester {

    @Test
    public void testInsertElement()
    {
        Integer i = 6;
        LinkedList<Integer> list_to_test = new LinkedList<Integer>();
        list_to_test.pushFront(i);
        assertEquals(6, list_to_test.getFront());
    }
}
