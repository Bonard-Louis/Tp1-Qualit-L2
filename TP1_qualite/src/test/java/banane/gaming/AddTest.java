package banane.gaming;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AddTest extends TestCase {

    public void testAdditionPositive() {
        Add add = new Add();
        assertEquals("5 + 2 doit être 7", 7, add.add(5, 2));
    }

    public void testAdditionAvecZero() {
        Add add = new Add();
        assertEquals("5 + 0 doit être 5", 5, add.add(5, 0));
    }

    public void testAdditionNegative() {
        Add add = new Add();
        assertEquals("2 + (-3) doit être -1", -1, add.add(2, -3));
    }
}
