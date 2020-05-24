import java.util.*;


public class BucketSort {
    /*
    uses hashed buckets for sorting:
    1. scattering data based on their hashed values on different buckets, scattering phase
    bucket based on 10's position
    2. sort each buckets, sort phases, can use any sort algorithms, we use the sort function in collection interface
    3. concatenate the buckets, Gathering phase

    not- in place, use an array for buckets
    stability depends on the sort function
    Time complexity: O(n)
     */

    public static void main(String[] args) {
        int[] intArray = {54,46,83,66,95,92,43};

        bucketSort(intArray);

        for(int i=0; i<intArray.length; i++)
            System.out.println(intArray[i]);
    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];


        for(int i=0; i<buckets.length; i++)
        {
            //using ArrayList
            buckets[i] = new ArrayList<Integer>();
//
//            //using LinkedList:
//            buckets[i] = new LinkedList<Integer>();

//            //using vector:
//            buckets[i] = new Vector<Integer>();
        }

        //scattering phase:
        for(int i = 0; i<input.length; i++)
        {
            int hashedKey = hash(input[i]);
            buckets[hashedKey].add(input[i]);
        }

        //Sort phase:
//        for(List bucket : buckets)
        for(int i=0; i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //concatenating phase:
        int index = 0;
        for(int i =0; i<buckets.length; i++)
            for(int bucketElement : buckets[i] )
            {
                input[index++] = bucketElement;

            }


    }
    private static int hash(int value){
        return value /10;
    }

}
