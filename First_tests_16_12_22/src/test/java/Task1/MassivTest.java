package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

class MassivTest {
    @Test
    public void  deleteElementFromArrayTest(){
        assertArrayEquals(new int []{4,5,-3,8}, Massiv.deleteElementFromArray(new int []{4,5,7,-3,7,8}, 7));
    }
    public void negativetest(){
        assertNotEquals(1,1);
    }
    public void positiveTest(){
        assertEquals(3,7);
    }
}