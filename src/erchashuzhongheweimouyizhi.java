/**
 * Created by liunian on 2017/6/8.
 */
/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。*/
import java.util.ArrayList;
import java.util.Arrays;

public class erchashuzhongheweimouyizhi {
    ArrayList<ArrayList<Integer>>  rt = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> ls = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root==null) return rt;
        ls.add(root.val);
        if (root.left==null&&root.right==null){
            if (root.val==target)
            rt.add(new ArrayList<Integer>(ls));
            return rt;
        }
        if (root.left!=null){
        FindPath(root.left,target-root.val);
        ls.remove(ls.size()-1);}
        if (root.right!=null){
        FindPath(root.right,target-root.val);
        ls.remove(ls.size()-1);}
        return rt;
    }
}
