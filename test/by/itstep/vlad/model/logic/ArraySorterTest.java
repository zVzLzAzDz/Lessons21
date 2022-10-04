package by.itstep.vlad.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {


    private int[] array;

    @Before
    public void init() {
        array = new int[]{7, 5, 6, 4, 5, 3, 4, 2, 3, 1};

    }

    @After
    public void destroy(){
        array = null;
    }

    @Test
    public void testBubbleSortAsc() {

        //arrange
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);

        assertArrayEquals(expected, array);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//
//            }
//        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortAscWithNull() {
        ArraySorter.bubbleSortAsc(null);


    }


    @Test
    public void testBubbleSortAscWithEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);

    }

    @Test
    public void testSelectedSortAsc() {

        //arrange

        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.selectedSortAsc(array);
        ;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortAscWithNull() {
        ArraySorter.selectedSortAsc(null);


    }


    @Test
    public void testSelectedSortAscWithEmptyObject() {
        ArraySorter.selectedSortAsc(new int[0]);

    }


    @Test
    public void testSelectedSortDesc() {

        //arrange

        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.selectedSortDesc(array);


        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortDescWithNull() {
        ArraySorter.selectedSortDesc(null);


    }


    @Test
    public void testSelectedSortDescWithEmptyObject() {
        ArraySorter.selectedSortDesc(new int[0]);

    }
}


