package day17;

import java.util.ArrayList;

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca2(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null;
        }
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i - 1);
    }

    public static void main(String[] args) {
        Node sc = new Node(1);
        sc.left = new Node(2);
        sc.right = new Node(3);
        sc.left.left = new Node(4);
        sc.left.right = new Node(5);
        sc.right.left = new Node(6);
        sc.right.right = new Node(7);

        Node ans = lca2(sc, 4, 7);
        System.out.println("LCA of 4 and 7: " + ans.data);
    }
}
