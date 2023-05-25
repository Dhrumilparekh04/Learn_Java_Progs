class p31 {
    public void shellSort(int[] arr) {
        int n = arr.length;
        
        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort on elements at the specified gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                
                // Shift elements at the specified gap until the correct position is found
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                
                // Place the current element in its correct position
                arr[j] = temp;
            }
        }
    }
    
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        p31 sorter = new p31();
        int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
        
        System.out.println("Original Array:");
        sorter.printArray(arr);
        
        sorter.shellSort(arr);
        
        System.out.println("Sorted Array:");
        sorter.printArray(arr);
    }
}
