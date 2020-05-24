public class RadixSort {
    /*
      Radix sort:
      uses a Stable form of counting sort

      Stable sort
      Time Complexity: O(n) but usually it takes more than O(n log n) because of overhead operations
    */
    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        int radix = 10;
        int width = 4;

        radixSort(intArray, radix, width);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void radixSort(int[] intArray, int radix, int width) {

        for (int i = 0; i < width; i++) {
            radixSortByOne(intArray, radix, i);
        }
    }

    private static void radixSortByOne(int[] intArray, int radix, int pos) {
        int numElements = intArray.length;
        int[] tempArray = new int[numElements];
        int position = (int) Math.pow(radix, pos);
        int[] countArray = new int[radix];
        stableCountingSort(intArray, countArray, radix, position);

        //filling the temp array form the right to left to be stable
        for (int k = intArray.length - 1; k >= 0; k--) {
            tempArray[--countArray[getDigit(intArray[k], position, radix)]] = intArray[k];
        }
        //copying temp array to intArray, can't use clone because it does'nt change the reference
        for (int k = 0; k < intArray.length; k++) {
            intArray[k] = tempArray[k];
        }
    }

    private static void stableCountingSort(int[] intArray, int[] countArray, int radix, int position) {

        //calculating conventional countArray in Count sort
        for (int i = 0; i < intArray.length; i++) {
            countArray[getDigit(intArray[i], position, radix)]++;
        }

        //adjusting countArray to be stable
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }
    }

    private static int getDigit(int element, int position, int radix) {
        return element / position % radix;

    }
}
