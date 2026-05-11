import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseInputsTest{
    
    @Test
    public void testThatTheFunctionReturnsSomething(){

        int argumentToPass = 10;

        String expectedAnswer = ReverseInputs.taskTwo(argumentToPass);

        String actualAnswer = "[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]";

        assertEquals(actualAnswer, expectedAnswer);
    }

}
