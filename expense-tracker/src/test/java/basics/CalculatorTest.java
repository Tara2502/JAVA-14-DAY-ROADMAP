package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp(){
     calculator=new Calculator();
 }
    @Test
    public void testAddition(){

        //act
        int result=calculator.add(2,8);
        //assert
        assertEquals (10,result);
    }
    @Test
    public void testEvenNumber(){

        Assertions.assertTrue(calculator.isEven(16));
    }
    @Test
    public void testOddNumber(){

        Assertions.assertFalse(calculator.isEven(17));


    }
    public void testDivideByZero(){
        IllegalArgumentException exception= assertThrows(
            IllegalArgumentException.class,()->{
                calculator.divide(10,0);
            });
        assertEquals("Cannot divide by zero.",
                exception.getMessage());
    }

}
