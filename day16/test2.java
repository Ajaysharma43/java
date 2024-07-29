package day16;
import java.util.*;

public class test2 {
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean isindentical(node root,node subroot)
    {
        if(root==null || subroot==null)
        {
            return true;
        }
        if(root==null || subroot==null||root.data!=subroot.data)
        {
            return false;
        }
        return isindentical(root.left, subroot.left) && isindentical(root.right, subroot.right) && root.data==subroot.data;
    }
    public static boolean issubtree(node root , node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(isindentical(root,subroot))
        {
            return true;
        }
        return issubtree(root.left,subroot) || isindentical(root.right,subroot);
    }

    public static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lc = count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    public static int sum(node root)
    {
        if(root == null)
        {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls+rs+root.data;
    }
    public static int diameter(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);
        int self = lh+rh+1;
        return Math.max(Math.max(ld, rd),self);
        
    }
    public static void main(String[]args)
    {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(5);
        root.left.left = new node(2);
        root.left.right = new node(7);
        root.right.left = new node(8);
        root.right.right = new node(9);

        node subroot = new node(2);
        subroot.left = new node(5);
        subroot.right = new node(5);
        System.out.println(issubtree(root, subroot));
    }
}
