public class RadixSortForStrings {
    /*
      Radix sort:
      uses a Stable form of counting sort
      Not In-place
      Stable sort
      Time Complexity: O(n) but usually it takes more than O(n log n) because of overhead operations
    */
    public static void main(String[] args) {
        String[] strArr = {"bcdef", "dbaqe", "abcde", "omadd", "bbbbb"};
        int radix = 26;
        int width = 5;

        radixSort(strArr, radix, width);

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    private static void radixSort(String[] strArr, int radix, int width) {

        for (int i = width-1; i >=0; i--) {
            radixSortByOne(strArr, radix, i);
        }
    }

    private static void radixSortByOne(String[] strArr, int radix, int position) {
        int numElements = strArr.length;
        String[] tempArray = new String[numElements];

        //int position = pos ;//(int) Math.pow(radix, pos);
        int[] countArray = new int[radix];
        stableCountingSort(strArr, countArray, radix, position);

        //filling the temp array form the right to left to be stable
        for (int k = strArr.length - 1; k >= 0; k--) {
            tempArray[--countArray[getCharIndex(strArr[k].charAt(position))]] = strArr[k];
        }
        //copying temp array to intArray, can't use clone because it does'nt change the reference
        for (int k = 0; k < strArr.length; k++) {
            strArr[k] = tempArray[k];
        }
    }

    private static void stableCountingSort(String[] strArr, int[] countArray, int radix, int position) {

        //calculating conventional countArray in Count sort
        for (int i = 0; i < strArr.length; i++) {
            char c = strArr[i].charAt(position);
            countArray[getCharIndex(c)]++;
        }

        //adjusting countArray to be stable
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }
    }

    private static int getCharIndex(char element) {
        //to get the position subtract 96 from ASCII code:(all letters are lowercase)
        //and one more for the correct index
        //return (int)element-96-1;
        return (int)(element-'a');

    }
}
