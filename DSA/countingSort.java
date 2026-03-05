// Counting Sort is an efficient sorting 
// algorithm that works by counting the number 
// of occurrences of each unique element in the input array.

public class countingSort{
    public static void main(String[]args){
        int my_array[] = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};

       int max_val = my_array[0];

       for(int val : my_array){
            if(val > max_val){
                max_val = val;
            }
       }

       int count[] = new int[max_val + 1];

       for(int num : my_array){
            count[num]++;
       }

       int index = 0;
       for(int i = 0; i <= max_val; i++){
         while(count[i] > 0){
            my_array[index++] = i;
            count[i]--;
         }
        
       
       }


        System.out.println("Sorted Array: ");
        for(int val : my_array){
            System.out.print(val + " ");
        }
        System.out.println();

        
        
    }

    
}
