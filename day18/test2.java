package day18;

import java.util.ArrayList;
import java.util.List;

public class test2 {
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

    public static Node sortedArrayToBST(int[] arr) {
        return sortedArrayToBST(arr, 0, arr.length - 1);
    }

    private static Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
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

    public static void printRootToLeafPaths(Node root) {
        List<Integer> path = new ArrayList<>();
        findPaths(root, path);
    }

    private static void findPaths(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            findPaths(root.left, path);
            findPaths(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    private static void printPath(List<Integer> path) {
        for (int value : path) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int sortedArr[] = {1, 2, 3, 4, 5, 6, 7};
        Node root = sortedArrayToBST(sortedArr);

        System.out.println("Inorder traversal of the BST:");
        inorder(root);
        System.out.println();

        int low = 3;
        int high = 7;
        System.out.println("Nodes within range [" + low + ", " + high + "]:");
        PrintRange(root, low, high);
        System.out.println();

        System.out.println("Root to leaf paths:");
        printRootToLeafPaths(root);
    }
}
