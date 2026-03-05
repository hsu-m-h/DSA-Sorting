import java.util.Arrays;

// This merge sort implementation is an iterative version of the divide
//  and conquer algorithm. 
// It uses a bottom-up approach, starting with subarrays of size one 
// and merging them together iteratively until the entire array is sorted.
// The time complexity of this algorithm is also O(n log n) in all cases, 
// making it efficient for sorting large datasets. This version avoids the 
// overhead of recursive function calls, which can be beneficial in terms of
//  performance and memory usage for large arrays.
public class mergeSortV2 {
    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};

        double[] sortedArr = mergeSort(unsortedArr);

        System.out.println("Sorted Array : ");
        for(double num : sortedArr){
            System.out.print(num + " ");
        }
}

    public static double[] mergeSort(double[] arr){
       
        int step = 1;
        int length = arr.length;

        while(step < length){
        for(int i = 0 ;i < length ; i += 2 * step){
        int mid = Math.min(i + step, length);
        int end = Math.min(i + 2 * step, length);

        double[] leftSort = Arrays.copyOfRange(arr, i, mid);
        double[] rightSort = Arrays.copyOfRange(arr, mid, end);

        double[] merged = merge(leftSort, rightSort);
        System.arraycopy(merged, 0, arr, i, merged.length);
    }
    step *= 2;
}
return arr;
    }

    public static double[] merge(double[]left, double[] right){

        double[] result = new double[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while(i < left.length){
            result[k++] = left[i++];
        }

        while(j < right.length){
            result[k++] = right[j++];
        }
        return result;
    }

}
