/**
 * Created by liunian on 2017/6/26.
 */

/**请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。*/

public class duichengdeerchashu {

    boolean isSymmetrical(TreeNode pRoot)
    {
        //这个二叉树应该是轴对称的，递归做
        if (pRoot!=null)
        {
            TreeNode left = pRoot.left;
            TreeNode right = pRoot.right;
            if (left==null&&right==null)return true;
            if (left!=null &&right!=null&&left.val == right.val)
                return helper(left.left,right.right) &&helper(left.right,right.left);
            return false;
        }
        return true;
    }

    boolean helper(TreeNode left , TreeNode right){
        if (left==null&&right==null)return true;
        if (left==null&&right!=null)return false;
        if (left!=null&&right==null)return false;
        if (left.val!=right.val)
            return false;
        return helper(left.left,right.right)&&helper(left.right,right.left);
    }
}
