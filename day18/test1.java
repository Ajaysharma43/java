package day18;

public class test1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void PrintRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.data > low) {
            PrintRange(root.left, low, high);
        }
        if (root.data >= low && root.data <= high) {
            System.out.print(root.data + " ");
        }
        if (root.data < high) {
            PrintRange(root.right, low, high);
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 1, 2, 5, 7, 8 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        System.out.println("Inorder traversal of the BST:");
        inorder(root);
        System.out.println();

        int low = 3;
        int high = 7;
        System.out.println("Nodes within range [" + low + ", " + high + "]:");
        PrintRange(root, low, high);
        System.out.println();
    }
}