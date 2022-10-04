package by.itstep.vlad.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterMinusTest {

    @Test
    public void testBubbleSortAsc() {

        //arrange
        int[] array = {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
        int[] expected = {7, 6, 5, 5, 4, 4, 3, 3, 2, 1};

        ArraySorter.bubbleSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortAscWithNull() {
        ArraySorter.bubbleSortAsc(null);


    }


    @Test
    public void testBubbleSortAscWithEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);

    }
}

