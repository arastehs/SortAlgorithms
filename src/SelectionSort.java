public class SelectionSort {

    /*
   Selection sort:
   Select the largest element at each iterate and swap it with the end element at unsorted partition
   more efficient than bubble algorithm, but it is an Unsatble sort
   In-place
   Time Complexity: O(n^2)
    */
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int unSortedPartitionIndex = intArray.length - 1; unSortedPartitionIndex > 0; unSortedPartitionIndex--) {

            int largest = 0;
            for (int i = 1; i <= unSortedPartitionIndex ; i++) {
                if (intArray[i] > intArray[largest])
                    largest = i;
            }

            swap(intArray, largest, unSortedPartitionIndex);

        }
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
