package day18;
class SortedArrayToBalancedBST{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    class BST{
        Node root;
        BST(){
            root = null;
        }

        public Node sortedArrayToBST(int[] arr, int start, int end){
            if(start > end){
                return null;
            }
            int mid = (start + end) / 2;
            Node root = new Node(arr[mid]);
            root.left = sortedArrayToBST(arr, start, mid-1);
            root.right = sortedArrayToBST(arr, mid+1, end);
            return root;
        }

        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        SortedArrayToBalancedBST bst = new SortedArrayToBalancedBST();
        BST bst1 = bst.new BST();
        Node root = bst1.sortedArrayToBST(arr, 0, arr.length-1);
        System.out.print("Inorder : ");
        bst1.inorder(root);
        System.out.println();
        System.out.print("Preorder : ");
        bst1.preorder(root);
        System.out.println();
        System.out.print("Postorder : ");
        bst1.postorder(root);
    }
}