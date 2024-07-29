package day17;

public class test4 {
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public static Node remove(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = remove(root.left, data);
        } else if (data > root.data) {
            root.right = remove(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            root.data = minValue(root.right);
            root.right = remove(root.right, root.data);
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 1, 2, 5, 7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        System.out.println("Inorder traversal before deletion:");
        inorder(root);
        System.out.println();

        root = remove(root, 3);
        System.out.println("Inorder traversal after deleting 3:");
        inorder(root);
        System.out.println();

        root = remove(root, 6);
        System.out.println("Inorder traversal after deleting 6:");
        inorder(root);
        System.out.println();
    }
}
