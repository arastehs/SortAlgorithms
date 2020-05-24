public class ShellSort {
    /*
 Shell sort:
  A variation of Insertion short
  In-place
  Unstable
 Time Complexity: O(n^2)
 unlike insertion sort It doesn't require lots of shift
  */
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int gap = intArray.length/2;

        while(gap>0) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j;
                for (j = i; j > 0 && intArray[j - gap] > newElement; j = j - gap)
                    intArray[j] = intArray[j - gap];

                intArray[j] = newElement;

            }
            gap = gap/2;
        }


        for (int j = 0; j < intArray.length; j++)
            System.out.println(intArray[j]);

    }


}
