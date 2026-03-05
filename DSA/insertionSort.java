// Insertion Sort is a simple sorting algorithm that builds the 
// final sorted array one item at a time. It is much less efficient 
// on large lists than more advanced algorithms such as quicksort, 
// heapsort, or merge sort. However, it has several advantages, 
// such as simple implementation, efficient for small data sets,
//  and stable (does not change the relative order of equal elements).

public class insertionSort{
    public static void main(String[]args){
        int my_array[] = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        for(int i = 1; i < n; i++){
            int insertIndex = i; //1;
            int currentVal = my_array[i];
            int j = i - 1;//0

           while(j >= 0 && my_array[j] > currentVal){
            my_array[j+1]  = my_array[j];
            insertIndex = j;
            j--;
           }

           my_array[insertIndex] = currentVal;
        }

        System.out.println("Sorted Array: ");
        for(int val : my_array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
