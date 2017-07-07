import java.util.ArrayList;
import java.util.ArrayList;

/**
 * Created by liunian on 2017/6/30.
 */
public class pinghengerchashu {
    public boolean IsBalanced_Solution(TreeNode root) {
        //递归,写一个计算判断某个节点的高度，然后将所有的节点全部应用此函数，计算左右子树的高度差
        //这样做对每个节点都计算高度，会有很多的重复计算
        //!!!不需要上述的做法，只要在计算书的深度的时候判断两颗子树的高度差，
        //!!!因为计算树的高度必须由底向上，既然这样，在计算的时候，就可以判断左右子树的高度差，有false就返回false
        if (root==null)return true;

        helper(root);
        if (ls.contains(false))
            return false;
        else return true;
    }
    //计算一棵树的高度
    ArrayList<Boolean> ls = new ArrayList<>();//用boolean值代替，不需要数组
    public int helper(TreeNode root){
        if (root==null)return 0;
        int lefth  = helper(root.left)+1;
        int righth = helper(root.right)+1;
        if (Math.abs(lefth-righth)>1) ls.add(false);
        return Math.max(lefth,righth);
    }


    public static void main(String[] args){
        pinghengerchashu s = new pinghengerchashu();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        TreeNode t5= new TreeNode(5);

        t1.left = t2;t1.right=t4;t2.left=t3;t2.right=null;t3.left=null;t3.right=null;t4.left=null;t4.right=null;
        t3.left = t5;t3.right=null;
        t5.left=null;t5.right=null;
        System.out.print(s.IsBalanced_Solution(t1));
    }

}
