// This is a Java implementation of the Radix Sort algorithm. 
// Radix Sort is a non-comparative integer sorting algorithm 
// that sorts numbers by processing individual digits. 
// The algorithm works by distributing the numbers into 
// buckets based on their digits and then collecting them back in order. 
// This process is repeated for each digit, starting from the least 
// significant digit to the most significant digit.
public class radixSortV1{
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

    
    
}
