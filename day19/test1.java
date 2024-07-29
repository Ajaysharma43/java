package day19;

public class test1 {
    static class treenode {
        int data;
        treenode left, right;

        public treenode(int item) {
            data = item;
            left = right = null;
        }
    }

    treenode root;
    treenode head;
    treenode prev;

    void treetodll(treenode node) {
        if (node == null) {
            return;
        }

        treetodll(node.left);

        if (prev == null) {
            head = node;
        } else {
            node.left = prev;
            prev.right = node;
        }
        prev = node;

        treetodll(node.right);
    }

    void printddl(treenode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test1 tree = new test1();

        tree.root = new treenode(10);
        tree.root.left = new treenode(12);
        tree.root.right = new treenode(15);
        tree.root.left.left = new treenode(25);
        tree.root.left.right = new treenode(30);
        tree.root.right.right = new treenode(36);

        tree.treetodll(tree.root);
        tree.printddl(tree.head);
    }
}