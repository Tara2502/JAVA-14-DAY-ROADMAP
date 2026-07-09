package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition(){
        //arrange
        Calculator calculator=new Calculator();
        //act
        int result=calculator.add(2,8);
        //assert
        assertEquals (10,result);
    }
    @Test
    public void testEvenNumber(){

        Calculator calculator=new Calculator();
        Assertions.assertTrue(calculator.isEven(16));
    }
    @Test
    public void testOddNumber(){
        Calculator calculator=new Calculator();
        Assertions.assertFalse(calculator.isEven(17));


    }

}
