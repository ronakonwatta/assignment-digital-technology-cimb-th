package assignment.digitaltechnologycimbth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Q2Test {

    @Test
    void test01() {
        String version1 = "1.01";
        String version2 = "1.001";

        Q2 q2 = new Q2();
        int actual = q2.solve(version1, version2);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void test02() {
        String version1 = "1.0";
        String version2 = "1.0.0";

        Q2 q2 = new Q2();
        int actual = q2.solve(version1, version2);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void test03() {
        String version1 = "0.1";
        String version2 = "1.1";

        Q2 q2 = new Q2();
        int actual = q2.solve(version1, version2);

        int expected = -1;

        assertEquals(expected, actual);
    }

}
