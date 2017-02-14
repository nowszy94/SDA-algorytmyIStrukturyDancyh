package algorytmy.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {-3,2,-1,3,4,5,6,4,2,1,4,5,2,5,6,3,-2,-5};
        int[] array2 = {-3,2,-1,3,4,5,6,4,2,1,4,5,2,5,6,3,-2,-5};
        System.out.println(Arrays.toString(bubbleSort.ascSort(array)));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));
    }

    public int[] ascSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0 ; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0 ; j <array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag;
        for (int i = 0 ; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0 ; j <array.length - 1 - i; j++) {
                counter++;
                if (array[j] < array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

}
