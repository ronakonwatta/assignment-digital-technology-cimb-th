package assignment.digitaltechnologycimbth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Q3Test {
    @Test
    void test01(){
        Q3 q3 = new Q3();
        int actual = q3.solve(2);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void test02(){
        Q3 q3 = new Q3();
        int actual = q3.solve(3);

        int expected = 3;

        assertEquals(expected, actual);
    }
}
