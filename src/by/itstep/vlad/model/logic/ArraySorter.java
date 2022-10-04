package by.itstep.vlad.model.logic;

public class ArraySorter {
    public static void bubbleSortAsc(int[] array) {


        int count = 0;

        if (array == null) {
            return;
            //throw new RuntimeException();
        }

        for (int j = 0; j < array.length - 1; j++) {

            for (int i = 0; i < array.length - 1; i++) {
                count++; //debug
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }


            }

        }
        System.out.println("count = " + count);//debug

    }
}
