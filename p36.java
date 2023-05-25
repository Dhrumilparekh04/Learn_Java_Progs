class p36 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Array is already sorted or empty
        }
        
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, temp, 0, n - 1);
    }
    
    private static void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return; // Base case: Subarray has 1 or 0 elements
        }
        
        int mid = left + (right - left) / 2;
        mergeSortHelper(arr, temp, left, mid); // Sort left half
        mergeSortHelper(arr, temp, mid + 1, right); // Sort right half
        merge(arr, temp, left, mid, right); // Merge sorted halves
    }
    
    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // Index for left subarray
        int j = mid + 1; // Index for right subarray
        int k = left; // Index for merged array
        
        // Merge the two sorted subarrays into the temporary array
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        // Copy the remaining elements from the left subarray (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        // Copy the remaining elements from the right subarray (if any)
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        // Copy the merged elements back to the original array
        for (int m = left; m <= right; m++) {
            arr[m] = temp[m];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        
        System.out.println("Array before sorting:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("Array after sorting:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
