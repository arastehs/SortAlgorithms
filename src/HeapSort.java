public class HeapSort {
    public static void main(String[] args) {
        int[] array = {10, 4, 3, 5, 1};
        int n = array.length;
        heapSort(array, n);

        for(int i =0; i<n; i++){
            System.out.println(array[i]+" ");
        }
    }

    private static void heapSort(int[] array, int n) {

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

            for (int j = n - 1; j >= 0; j--) {
                int temp = array[j];
                array[j] = array[0];
                array[0] = temp;

                heapify(array, j, 0);
            }
        }


    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && array[l] > array[largest]) {
            largest = l;
        }
        if (r < n && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
}
