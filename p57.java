public class p57 {
    public static int checkArrayCondition(int[] arr) {
        if (arr.length < 3) {
            return 0; // Array has less than 3 elements, so condition not satisfied
        }

        int count = 1;
        boolean ascending = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                if (ascending && arr[i] == arr[i - 1]) {
                    count++;
                    if (count >= 3) {
                        return 1; // Condition satisfied
                    }
                } else {
                    ascending = true;
                    count = 1;
                }
            } else {
                ascending = false;
                count = 1;
            }
        }

        return 0; // Condition not satisfied
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 2, 2 };
        int[] arr2 = { 1, 1, 1, 3, 3, 3, 3 };
        int[] arr3 = { 2, 2, 2, 1, 1, 1 };

        System.out.println("Array 1: " + checkArrayCondition(arr1));
        System.out.println("Array 2: " + checkArrayCondition(arr2));
        System.out.println("Array 3: " + checkArrayCondition(arr3));
    }
}
