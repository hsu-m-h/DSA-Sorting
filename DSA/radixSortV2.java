// This radix sort implementation uses bubble sort as the 
// sorting algorithm for each digit.

public class radixSortV2{
    public static void main(String[]args){
        int my_array[] = {170, 45, 75, 90, 802, 24, 2, 66};
    
        int max_val = my_array[0];
        for(int val : my_array){
            if(val > max_val){
                max_val = val;
            }
        }

      
        int radixArray[][] = new int[10][my_array.length];
        int counts[] = new int[10];
        int exp = 1;

        while(max_val / exp > 0){
            
            for(int num : my_array){
                int radixIndex = (num / exp) %10;
                radixArray[radixIndex][counts[radixIndex]] = num;
                counts[radixIndex]++;
            }

            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < counts[i]; j++){
                    my_array[pos] = radixArray[i][j];
                    pos++;
                }
                counts[i] = 0;
            }
            exp *= 10;
        }

        System.out.println("Sorted Array: ");
        for(int val : my_array){
            System.out.print(val + " ");
        }
        System.out.println();

        
        
    }

    public static void bubbleSort(int[]my_array){
        int n = my_array.length;
                for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1;j++){
                if(my_array[j] > my_array[j+1]){
                    int temp = my_array[j];
                    my_array[j] = my_array[j+1];
                    my_array[j+1] = temp;
                }
            }
        }

    }

    
}
