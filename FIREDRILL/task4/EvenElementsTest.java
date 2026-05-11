import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenElementsTest{
    
    @Test
    public void testThatTheFunctionReturnsSomething(){

        int [] argumentToPass = {11,22,33,44,55,66,77,88,99,100};

        String expectedAnswer = EvenElements.taskFour(argumentToPass);

        String actualAnswer = "[22, 44, 66, 88, 100]";

        assertEquals(actualAnswer, expectedAnswer);
    }

}
