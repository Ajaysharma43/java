package day17;

public class test1 {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void level(node root, int level, int k) {
        if (root == null) {
            return;
        }
        if(level == k)
        {
            System.out.println(root.data+" ");
            return;
        }
        level(root.left, level + 1, k);
        level(root.right, level + 1, k);
        
    }

    public static void main(String[] args) {
        node sc = new node(1);
        sc.left = new node(2);
        sc.right = new node(3);
        sc.left.left = new node(4);
        sc.left.right = new node(5);
        sc.right.left = new node(6);
        sc.right.right = new node(7);

        int k = 3;
        level(sc, 1, k);
    }
}
