import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddElementsTest{
    
    @Test
    public void testThatTheFunctionReturnsSomething(){

        int [] argumentToPass = {11,22,33,44,55,66,77,88,99,100};

        String expectedAnswer = OddElements.taskThree(argumentToPass);

        String actualAnswer = "[11, 33, 55, 77, 99]";

        assertEquals(actualAnswer, expectedAnswer);
    }

}
