public class QuickSort {
    /*
        Quick sort:
      use a pivot an based on the pivot does sorting
        In-place
        Unstable sort
        Time Complexity: O(nlogn)
        Worst case: O(n^2)
         */
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);


        for (int j = 0; j < intArray.length; j++)
            System.out.println(intArray[j]);
    }

    public static void quickSort(int[] input, int start, int end) {

        if (end - start < 2)
            return;

        int i = start;
        int j = end;
        int pivot = input[start];

        while (i < j) {
            //an empty loop only for decreasing the j
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            //an empty loop only for increasing the i
            while (i < j && input[++i] <= pivot) ;

            if (i < j) {
                input[j] = input[i];
            }
        }
        input[i] = pivot;

        quickSort(input, start, i);
        quickSort(input, i + 1, end);
    }


}
