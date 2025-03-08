package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static java.beans.Beans.isInstanceOf;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.InstanceOfAssertFactories.map;

public class CalculatorJTest {

    public class CalculatorJTest {
        private  final Calculator calculatorUT = new Calculator();

        @Test
        public void  testSubtract() {
            assertThat(calculatorUT.subtract(-2, 2))
                    .isEqualTo(-4,8);
            assertThat(calculatorUT.subtract(2,-2) == 4)
                    .isInstanceOf(boolean.class)
                    .is.True(-4,8);

        }

        @Test
        public void testDivide() {
            assertThatThrownBy(() -> {
                calculatorUT.divide(2,0);
            }) AbstractThrowableAssert<capture of?. captureof extends Throwable>
            .isInstanceOf(ArithmeticException.class);
            .has.Mesages
        }

    }
}
