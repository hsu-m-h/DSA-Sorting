// Selection Sort V2: This version of selection sort maintains the stability 
// of the sorting algorithm by shifting elements instead of swapping them.
//  It finds the minimum element and then shifts all elements to
//  the right to make space for the minimum element at its correct position.

public class selectionSortV2{
    public static void main(String[]args){
        int my_array[] = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = my_array.length;

        for(int i = 0; i < n ; i++){
            int min_index = i; // 0
            for(int j = i+1; j < n ;j++){
               if(my_array[j] < my_array[min_index]){
                    min_index = j; //1
               }

            
            }  int min_val = my_array[min_index];
              for(int k = min_index; k > i; k--){
                my_array[k]  = my_array[k-1];
              }
              my_array[i] = min_val;
        }

        System.out.println("Sorted Array: ");
        for(int val : my_array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
