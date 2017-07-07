/**
 * Created by liunian on 2017/7/3.
 */

import java.util.ArrayList;

/***输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 *
 *
要求不能创建任何新的结点，只能调整树中结点指针的指向。**/
public class erchasousuoshuyushaungxianglianbiao {
//    ArrayList<TreeNode> ls = new ArrayList<>();
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        //先序遍历，存节点，然后构建链表
//        helper(pRootOfTree);
//        if(ls.size()==0)return null;
//        for (int i=0 ;i<ls.size();i++){
//            if (i!=ls.size()-1)ls.get(i).right = ls.get(i+1);
//            else ls.get(i).right = null;
//            if (i!=0)ls.get(i).left = ls.get(i-1);
//
//        }
//        return ls.get(0);
//
//    }
//
//    public void helper(TreeNode root){
//        if (root==null)
//            return;
//        helper(root.left);
//        ls.add(root);
//        helper(root.right);
//
//    }
    //没超时 ，qnmd 妈的 ，理解错了 写成了双向循环链表
    //就在中序遍历的时候构建双向链
    TreeNode rtnode;
    public  TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree==null)
            return null;
        if (pRootOfTree.left==null&&pRootOfTree.right==null)
        {
            rtnode = pRootOfTree;//更新左树最后一颗节点的位置，当前看就是右子树的最后一颗节点
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        if (left!=null) {
            rtnode.right = left;
            pRootOfTree.left = rtnode;
        }
        rtnode =pRootOfTree; //左子树的最后一课节点更新到叶子节点

        TreeNode right = Convert(pRootOfTree.right);
        if (right!=null)
            right.left = pRootOfTree; //root和右子树的双向链表的头链接
        pRootOfTree.right = right;
        return left!=null?left:pRootOfTree; // 左子树的双向链表的头返回
    }
}
