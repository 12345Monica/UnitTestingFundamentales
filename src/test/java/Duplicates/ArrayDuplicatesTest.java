package Duplicates;

import org.example.aplicates.ArrayDuplicates;
import org.junit.jupiter.api.Test;

import static java.awt.Color.orange;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayDuplicatesTest {
    /*Implement the method in the ArrayExample class using the TDD approach: public static
    String[] removeDuplicates(String[] array)
     Method should return new array without duplicates.

     input = { apple, banana, apple, orange, banans}
     Remov Duplicates(impu)

     */


    @Test
    public void testRemoveDuplicatesGoodFlow() {
        String[] imput = {"apple", "banana", "apple", "orange", "banana"};
        String[] expected = {"apple", "banana", "orange"};

                assertThat(ArrayDuplicates.removeDuplicates(imput))
                        .containsExactlyInAnyOrder(expected);
        }
    }

