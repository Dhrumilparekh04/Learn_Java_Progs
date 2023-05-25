import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class p28 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 8, 1, 3, 7, 5};
        treeSort(arr);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void treeSort(int[] arr) {
        TreeNode root = null;

        // Build the binary search tree
        for (int num : arr) {
            root = insert(root, num);
        }

        // Perform an in-order traversal to get the sorted array
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedList.get(i);
        }
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrderTraversal(TreeNode root, List<Integer> sortedList) {
        if (root != null) {
            inOrderTraversal(root.left, sortedList);
            sortedList.add(root.val);
            inOrderTraversal(root.right, sortedList);
        }
    }
}
