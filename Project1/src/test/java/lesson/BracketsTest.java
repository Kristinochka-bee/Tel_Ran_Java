package lesson;

import org.junit.Test;

import static org.junit.Assert.*;



public class BracketsTest {

    @Test
    public void bracketsNegativeTest(){
        String line = "=";
        assertFalse(Brackets.bracket(line));
    }


    @Test
    public void bracketTestsPosetive(){
        String line = "({[[{)";
        assertFalse(Brackets.bracket(line));
    }
    @Test
    public void bracketTestNegative(){
        String line = "((()) [] {} [] ) ]";
        assertFalse(Brackets.bracket(line));
    }

    @Test
    public void brackNegTest(){
        String line ="(";
        assertFalse(Brackets.bracket(line));
    }

    @Test
    public void parenthPosTest(){
        String line = "()[]({[]})";
        assertTrue(Brackets.bracket(line));
    }

    @Test
    public void parenthNegativeTest(){
        String line = "({[[{)";
        assertFalse(Brackets.bracket(line));
    }

    @Test
    public void paenthNegTest(){
        String line = "}}";
        assertFalse(Brackets.bracket(line));
    }

}

