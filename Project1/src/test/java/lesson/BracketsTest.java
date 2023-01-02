package lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {
    @Test
    public void bracket() {
        boolean act = Brackets.bracket("(");
        boolean act1 = Brackets.bracket("((");
        boolean act2 = Brackets.bracket("()");


        assertFalse(act);
        assertFalse(act1);
        assertTrue(act2);
    }
    @Test
    public void bracketsNegativeTest(){
        String line = "((()) [] {} [] ) ]";
        assertFalse(Brackets.bracket(line));
    }

    @Test
    public void bracketsNegativeTest2(){
        String line2= ") } ]";
        assertFalse(Brackets.bracket(line2));
    }

    @Test
    public void closeBracketNegativeTest(){
        String line3 = ")";
        assertFalse(Brackets.bracket(line3));
    }


    @Test
    public void bracketsPosetiveAndNegativeTest() {
        String actual = "({[[{)";
        String expected = "({[]})";
        assertFalse(actual, false);
        assertTrue(expected,true);
    }

    @Test
    public void bracketNegativTest(){
        String act1 = "(";
        String exp = "()";
        assertFalse(act1,equals(exp)); //должно быть false если в стеке есть одна скобка , тогда вернет true
    }
    @Test
    public void brackets(){
        String actual = ") ] }";
        String expect = "() [] {}";
        assertFalse(actual,equals(expect));
    }








}

