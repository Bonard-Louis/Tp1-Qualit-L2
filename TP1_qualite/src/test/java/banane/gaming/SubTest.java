package banane.gaming;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SubTest extends TestCase {

    public void testSoustractionPositive() {
        Sub s = new Sub();
        assertEquals("5 - 2 doit être 3", 3, s.sub(5, 2));
    }

    public void testSoustractionAvecZero() {
        Sub s = new Sub();
        assertEquals("5 - 0 doit être 5", 5, s.sub(5, 0));
    }

    public void testSoustractionNegative() {
        Sub s = new Sub();
        assertEquals("2 - 3 doit être -1", -1, s.sub(2, 3));
    }
}