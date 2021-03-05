import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecondActivityTest {

    @Test
    public void whenAdd_isCorrect(){
        int add = SecondActivity.add(2, 3);
        assertEquals(5, add);
    }

    @Test
    public void whenSubtractXgreaterThanY_isCorrect(){
        int sub = SecondActivity.subtract(5, 3);
        assertEquals(2, sub);
    }

    @Test
    public void whenSubtractXsmallerThanY_isCorrect(){
        int sub = SecondActivity.subtract(1, 3);
        assertEquals(2, sub);
    }

    @Test
    public void whenMultiply_isCorrect(){
        int[] ints = {2, 5, 4};
        int mult = SecondActivity.multiply(ints);
        assertEquals(40, mult);
    }

    @Test
    public void whenDivideNonZero_isCorrect(){
        int div = SecondActivity.divide(10, 5);
        assertEquals(2, div);
    }

    @Test
    public void whenDivideZero_isZero(){
        int div = SecondActivity.divide(0, 5);
        assertEquals(0, div);
    }
}
