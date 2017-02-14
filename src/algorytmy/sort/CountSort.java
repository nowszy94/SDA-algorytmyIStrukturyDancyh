package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by Szymon on 2017-02-14.
 */
public class CountSort {

    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int[] array = {1,2,3,1,2,2,-1,-1,-2,-3,1,2,3,3,3,3,3,2,2,2,1,1,1,2,2,2,-1};
        System.out.println(Arrays.toString(countSort.ascSort(array)));
    }

    public int[] ascSort(int[] array) {
        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        for(int i = 0 ; i < array.length; i++) {
            rangeArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }

//    public int[] descSort(int[] array) {
//        return null;
//    }
}
