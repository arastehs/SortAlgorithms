public class CountingSort {

    //counting Sort
    //has some assumptions , min and max elements are known
    //not in-place
    //O(n)
    //Unstable Algorithm
    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);


        for (int j = 0; j < intArray.length; j++)
            System.out.println(intArray[j]);
    }

    private static void countingSort(int[] intArray, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < intArray.length; i++) {
            countArray[intArray[i] - min]++;
        }

//        int j=0;
//        for(int i=min; i<=max ;i++){
//            while(countArray[i-min]>0){
//                intArray[j++] = i;
//                countArray[i-min]--;
//            }
        int loc = 0;
        for (int i = 0; i < intArray.length; i++)
            while (countArray[i] > 0) {
                countArray[i]--;
                intArray[loc++] = min + i;
            }
    }
}
