package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest2 {

    @Test
    public void checkNumPosetivTest(){
         assertTrue(Numbers.checkNumber(new int[]{2, 5, 18, 50}, 36));
    }

    @Test
    public void checkNumNegativTest(){
        assertFalse(Numbers.checkNumber(new int[]{2, 5, 18, 50},40));
    }

    @Test
    public void compareNumOfArrPosetivTest(){
        assertTrue(Numbers.checkNumber(new int[]{3,5,6,9,1},15));
    }

    @Test
    public void compareNumOfArrNegativTest(){
        assertFalse(Numbers.checkNumber(new int[]{3,5,6,9,1},2));
    }

    @Test
    public void resultOfMultiplicationPosetiveTest(){
        assertTrue(Numbers.checkNumber(new int[]{1,5,7,2,8},7));
    }

}