import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class p51 {
    private static Integer firstMin;
    private static Integer secondMin;

    public static int findSecondMinimumValue(TreeNode root) {
        firstMin = null;
        secondMin = null;

        traverse(root);

        return secondMin != null ? secondMin : -1; // If secondMin is still null, return -1
    }

    private static void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        traverse(node.left);

        if (firstMin == null) {
            firstMin = node.val;
        } else if (node.val > firstMin) {
            if (secondMin == null) {
                secondMin = node.val;
            } else {
                secondMin = Math.min(secondMin, node.val);
            }
        }

        traverse(node.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes in the binary search tree: ");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the nodes:");

        TreeNode root = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            root = insert(root, val);
        }

        int secondMin = findSecondMinimumValue(root);

        System.out.println("The second minimum value in the BST is: " + secondMin);
    }

    private static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}
