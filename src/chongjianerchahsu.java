/**
 * Created by liunian on 2017/7/2.
 */

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。*/
public class chongjianerchahsu {
    TreeNode rootl ;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //用递归的方式来做
        ArrayList<Integer> zh = new ArrayList<Integer>();
        ArrayList<Integer> pre1 = new ArrayList<>();
       for (int i=0; i < in.length;i++){
           zh.add(in[i]);
       }

       if (pre.length==0)
           return null;
        for (int i=0 ; i<pre.length;i++){
            pre1.add(pre[i]);
        }
         rootl = new TreeNode(pre[0]);
        //int index = zh.indexOf(root.val);
//        ArrayList<Integer> left = new ArrayList<>();
//        ArrayList<Integer> right = new ArrayList<>();
//        left.addAll(zh.subList(0,index));
//        right.addAll(zh.subList(index+1,zh.size()));

//        helper(pre,left,root);
        pre1.remove(0);
        helper(pre1,zh,rootl);
        return rootl;
    }


    public void helper(ArrayList<Integer> pre, ArrayList<Integer> in,TreeNode root){
        int x = root.val;
        int y=pre.get(0);
        int index = in.indexOf(root.val);
        if (in.size()==1){root.left=null;root.right=null;return;}
        //if (index==-1){root.left=null;root.right=null;return;}
        System.out.println(root.val);
        System.out.println("pre数组："+pre.toString());
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        left.addAll(in.subList(0,index));
        right.addAll(in.subList(index+1,in.size()));


        if (left.size()==0)
            root.left = null;

        if (right.size()==0)
            root.right=null;
        if (left.contains(y)){
            root.left=new TreeNode(y);
            System.out.println("root的左节点"+root.val+"是"+y);
           pre.remove(0);
            helper(pre,left,root.left);
                //System.out.println("root的左节点"+root.val+"是"+y);


            if (right.size()!=0)helper(pre,right,root);
        }
        if (right.contains(y))
        {
            root.right = new TreeNode(y);
            System.out.println("root的右节点"+root.val+"是"+y);
            pre.remove(0);
            helper(pre,right,root.right);
            //if (pre.length>1)helper(Arrays.copyOfRange(pre,1,pre.length),left,root.right);
        }


    }


        public  static  void main(String[] args){
            chongjianerchahsu s = new chongjianerchahsu();
            int[] pre = {1,2,4,7,3,5,6,8};
            int[] in = {4,7,2,1,5,3,8,6};
            TreeNode root = s.reConstructBinaryTree(pre,in);
            System.out.print("----");
            System.out.print(root.left.val);
            //System.out.print(root.right.val);
            System.out.print(root.left.right.val);
            System.out.print(root.left.right.val);
            System.out.print(root.left.left.right.val);
    //        System.out.print(root.left);
    //        System.out.print(root.left);
    //        System.out.print(root.left);
        }
}
