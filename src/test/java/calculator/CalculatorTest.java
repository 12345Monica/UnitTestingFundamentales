package calculator;

/*Create Calculator class and implement operations: addition, subtraction, multiplication, division.
Then create CalculatorTest class with tests above operations.

USER STORY: tichet in Java de tipul Storu care sa indice BUSINESS LEVEL ce trebuie sa faca functionalitatea
-WHO?
-WHAT?
-WHY?

As user of digital scientific calculator,
Iwant to be able to do addition,subtraction, multiplication


Conform metodologiei TOD:
1.scriem testul care pica
2.scriem implementareacare trece testul
3.refactorizam

 testele unitare se comporta ca Source Of T
 */

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculatorUT = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculatorUT.add(2,3));
        assertEquals(-1.0,calculatorUT.add(-2,1));
        assertEquals(0.0,calculatorUT.add(2,-2));


    }

    @Test
    public  void testSubtracted() {
        assertEquals(-1.0, calculatorUT.subtract(2,3));
        assertEquals(-3.0,calculatorUT.subtract(-2,1));
        assertEquals(4.0,calculatorUT.subtract(2,-2));

    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculatorUT.multily(2,3));
        assertEquals(-2.0,calculatorUT.multily(-2,1));
        assertEquals(-4.0,calculatorUT.multily(2,-2));
    }

    @Test
    public void   testDivide() {
        assertEquals(1.5, calculatorUT.divide(3,2));
        assertEquals(-2.0,calculatorUT.divide(-2,1));
        assertEquals(-1.0,calculatorUT.divide(2,-2));


        /*
        al doilea argument al metodei  assertThrows este o interfata functionala neparametruizata
         */
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorUT.divide(1, 0);
        });
        assertEquals("Divide by zero", exception.getMessage());
    }

}
