1. Bubble sort:
compares each element with the next one
O(n^2), in-place, stable, degrades quickly

2. Selection sort:
in each iterate, find the largest element and push it to the end
O(n^2), In-place, unstable

3. Insertion sort:
in each iterate, the new element will be compared with the previous sorted array
new element finds its correct place in the sorted array and then the other remained elements will be shifted.
O(n^2), In-place, Stable

4. Shell sort:
a type of insertion sort but instead of comparing elements with the next one, we use a gap for comparing
a lot of ways for choosing a proper gap
the simplest one is n/2
in each step the gap will be divided by 2 until it reaches to zero
O(n^2), In-place, Unstable

5. Merge sort:
a divide and conquer algorithm
2 main phases: split & merge
do the sorting operations in the merge phase
using a midpoint for dividing (logical partitioning)
recursive implementation
O(n log n), Not in-place, Stable

6. Quick sort:
a divide and conquer algorithm
recursive implementation
use a pivot element to partition an array
in each iterate the pivot correct position will be find as follow:
left side < pivot < right side
O(n log n), worst case; O(n^2), In-place, unstable

7.Counting sort:
assume all values are non-negative and discrete
count count of the occurrence for each value
given an array which minimum and maximum value are known
O(n), Not in-place, unstable

8. Radix sort:
all the values must be of the same Radix and same width
must use a stable sort algorithm at each state, I used a stable form of counting sort
O(n),O(n log n) because ofthe overhead operations, in-place, stable 

9. Bucket sort:
use hashing with some assumptions about the data
9.1 Distribute the items into buckets based on their hashed values(scattering phase)
9.2 Sort the items in each bucket
9.3 Merge the buckets (just concatenate them, gathering phase)
O(n), not in-place, stability is based on the sort algorithm used for buckets' sorting
usually insertion sort is used

10. Heap sort:
heapify an array from the mid element
O(n log n), in-place, unstable
