/**
 * Created by liunian on 2017/6/15.
 */

import apple.laf.JRSUIUtils;

/**输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 * 最长路径的长度为树的深度。*/
public class erchashudeshendu {
    //法一：全部遍历
//    int maxdepth=0;
//    public int TreeDepth(TreeNode root) {
//      helper(root,0);
//        return maxdepth;
//    }
//
//    public void helper(TreeNode root,int depth){
//        if (root==null){
//            maxdepth = Math.max(maxdepth,depth);
//        }
//        else {
//            depth++;
//            helper(root.left,depth);
//
//            helper(root.right,depth);
//        }
//    }
    public int TreeDepth(TreeNode root) {
        if (root==null)return 0;
        return Math.max(1+TreeDepth(root.left),1+TreeDepth(root.right));
    }
}
