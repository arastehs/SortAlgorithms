public class InsertionSort {

    /*
   Insertion sort:
    every new element will be inserted at the correct position, we start whit one element in an array as to be already sorted
    comparing the new element with the right-most element of the sorted array and go back to the left
    when we find the first element smaller than or equal to the new element, it means that we have found the correct postion of the
    new element, so shift the other elements to the right
    In-place
    Stable
   Time Complexity: O(n^2)
    */
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray2 = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray);

        recursiveInsertionSort(intArray2,intArray2.length);

        System.out.println("Iterative Insertion sort results:");
        for (int j = 0; j < intArray.length; j++)
            System.out.print(intArray[j]+"   ");

        System.out.println("\n");
        System.out.println("-----------------------------------------");
        System.out.println("Recursive Insertion sort results:");

        for (int j = 0; j < intArray2.length; j++)
            System.out.print(intArray2[j]+"   ");

    }
    public static void insertionSort(int [] intArray){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {

                if (intArray[i] > newElement) {

                    intArray[i + 1] = intArray[i];
                } else
                    continue;
                intArray[i] = newElement;
            }

        }

        //method 2:
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//            int newElement = intArray[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex ; i > 0 && intArray[i-1]>newElement; i--) {
//
//                intArray[i] = intArray[i - 1];
//            }
//                intArray[i] = newElement;
//            }

    }

    public static void recursiveInsertionSort(int [] intArray, int numberOfRecords){

        /*
        it is like we want to sort an array with one smaller numbers  and then mix it with the last one
         */
        //breaking point: because on item is always sorted:
        if(numberOfRecords<2)
        {
            return;
        }
        recursiveInsertionSort(intArray,numberOfRecords-1);
        int newElement = intArray[numberOfRecords-1];
        for (int i = numberOfRecords-2; i >= 0; i--) {

            if (intArray[i] > newElement) {

                intArray[i + 1] = intArray[i];
            } else
                continue;
            intArray[i] = newElement;
        }

    }


}
