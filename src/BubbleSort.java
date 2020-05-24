public class BubbleSort {

    /*
    Bubble sort:
    compares each element with its next one
    one of the least efficient sorting algorithms
    In-place
    Stable sort
    Time Complexity: O(n^2)
     */

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        int unSortedPartitionIndex = intArray.length - 1;
        int i = 0;

        //using while:
//        while (unSortedPartitionIndex > 0) {
//
//            if (i < unSortedPartitionIndex && intArray[i] > intArray[i + 1])
//                swap(intArray, i, i + 1);
//            i++;
//            if (i == unSortedPartitionIndex) {
//                i = 0;
//                unSortedPartitionIndex--;
//            }
//        }

        //using for
        for (unSortedPartitionIndex = intArray.length - 1; unSortedPartitionIndex > 0; unSortedPartitionIndex--)
            for (i = 0; i < unSortedPartitionIndex; i++)
                if (intArray[i] > intArray[i + 1])
                    swap(intArray, i, i + 1);

        for (int j = 0; j < intArray.length; j++)
            System.out.println(intArray[j]);

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
