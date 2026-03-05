import java.util.Arrays;

// This merge sort implementation is a divide and 
// conquer algorithm that recursively divides the 
// input array into smaller subarrays until they are 
// of size one or zero (which are inherently sorted).
//  Then, it merges those sorted subarrays back together 
// in the correct order to produce a fully sorted array. 
// The time complexity of this algorithm is O(n log n) in all cases, 
// making it efficient for sorting large datasets.
public class mergeSortV1 {
    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};

        double[] sortedArr = mergeSort(unsortedArr);

        System.out.println("Sorted Array : ");
        for(double num : sortedArr){
            System.out.print(num + " ");
        }
}

    public static double[] mergeSort(double[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;

        double[] leftSort = Arrays.copyOfRange(arr, 0, mid);
        double[] rightSort = Arrays.copyOfRange(arr, mid, arr.length);

        double[] sortedLeft = mergeSort(leftSort);
        double[] sortedRight = mergeSort(rightSort);

        return merge(sortedLeft, sortedRight);
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

