import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testIfGiveMeASetDoesNotReturnEmptySet()
    {
        SetDiTest set = new SetDiTest();
        HashSet<String> list = set.getSet();
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIfElementGetsRemoved()
    {
        SetDiTest list = new SetDiTest();
        HashSet<String> set = list.getSet();
        HashSet<String> setCopied = set;
        String elementToBeRemoved = "test";
        set.add(elementToBeRemoved);
        list.removeElementFromSet(elementToBeRemoved);
        assertEquals(setCopied,set);
    }
    @Test
    public void testIfSetIsEmpty()
    {
        SetDiTest list = new SetDiTest();
        list.clearSet();
        assertTrue(list.getSet().isEmpty());
    }
}