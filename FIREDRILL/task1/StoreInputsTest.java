import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreInputsTest{
    
    @Test
    public void testThatTheFunctionReturnsSomething(){

        int argumentToPass = 10;

        String expectedAnswer = StoreInputs.taskOne(argumentToPass);

        String actualAnswer = "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]";

        assertEquals(actualAnswer, expectedAnswer);
    }

}
