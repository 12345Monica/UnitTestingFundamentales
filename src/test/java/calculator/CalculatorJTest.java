package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static java.beans.Beans.isInstanceOf;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.InstanceOfAssertFactories.map;

public class CalculatorJTest {

        private  final Calculator calculatorUT = new Calculator();

        @Test
        public void  testSubtract() {
            assertThat(calculatorUT.subtract(-2, 2))
                    .isEqualTo(-4.0);
            assertThat(calculatorUT.subtract(2,-2) == 4)
                    .isInstanceOf(Boolean.class)
                    .isTrue();

        }

        @Test
        public void testDivide() {
            assertThatThrownBy(() -> {
                calculatorUT.divide(2,0);
            })
            .isInstanceOf(ArithmeticException.class);

        }

    }

