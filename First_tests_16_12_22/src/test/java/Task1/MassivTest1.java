package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MassivTest1 {

        @Test
        public void deleteElementFromArrayTest() {
            assertArrayEquals(new int[]{4, 5, -3, 8}, Massiv.deleteElementFromArray(new int[]{4, 5, 7, -3, 7, 8}, 7));
        }
        @Test
        public void negativetest() {
            assertNotEquals(2, 1);
        }
        @Test
        public void positiveTest() {
            assertEquals(7, 7);
        }
        @Test
    public void deleteElementFromArrayTest1() {
        assertArrayEquals(new int[]{4, 5, 7,-3,7, 8}, Massiv.deleteElementFromArray(new int[]{4, 5, 7, -3, 7, 8}, 88));
    }
    @Test
    public void deleteElemFromArrayNegativesNumberPosetiveTest(){
            assertArrayEquals(new int[]{-4, -5, -3, -8}, Massiv.deleteElementFromArray(new int[]{-4, -5, -7, -3, -7, -8},-7));
    }
    @Test
    public void deleteElemFromArrayNegativesNumberNegativeTest(){
        assertNotEquals (new int[]{-4, -5, -3,-7, -8}, Massiv.deleteElementFromArray(new int[]{-4, -5, -7, -3, -7, -8},-7));
    }
    }
