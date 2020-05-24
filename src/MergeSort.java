public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
    }

    private static void mergeSort(int[] input, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2)
            return;

        int midPoint = (startIndex + endIndex) / 2;
        mergeSort(input, startIndex, midPoint);
        mergeSort(input, midPoint, endIndex);
        merge(input, startIndex, midPoint, endIndex);
    }

    private static void merge(int[] input, int startIndex, int mid, int endIndex) {
        //first optimization: array is already sort, do'nt need anything
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = startIndex; //starting point of the left array
        int j = mid; // starting point of the right array
        int[] tempArr = new int[endIndex - startIndex]; //we need a temp array with size sum of two half arrays
        int temIndex = 0;//starting point of the temp array
        while (i < mid && j < endIndex) {
            if (input[i] <= input[j])
                tempArr[temIndex++] = input[i++];
            else
                tempArr[temIndex++] = input[j++];
        }
        //second optimization:
        //we don't need to copy all the leftover elements in the right array because they are ok in the destination
        //but we need to copy all the leftover elements in the left array to the destination
        System.arraycopy(input, i, input, temIndex + startIndex, mid - i);
        System.arraycopy(tempArr, 0, input, startIndex, temIndex);
    }

}
