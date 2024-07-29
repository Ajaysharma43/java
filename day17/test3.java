package day17;

public class test3 {
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
    public static node insert(node root,int val)
    {
        if(root==null)
        {
            root=new node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insert(root.left, val);
        }
        if(root.data<val)
        {
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,1,2,5,7};
        node root = null;
        for(int i = 0 ; i < arr.length; i++)
        {
            root=insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
    }
}
