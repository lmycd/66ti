/**
 * Created by liunian on 2017/7/2.
 */
public class qianxuzhongxu {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return  helper(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode helper(int[] pre,int startpre, int endpre ,int[] in,int startin ,int endin){
        if (startin>endin||startpre>endpre){
            return null;
        }

        TreeNode root = new TreeNode(pre[startpre]);
        for (int i= startin ; i <= endin;i++){
            if (root.val==in[i]){
                root.left = helper(pre,startpre+1,i-startin+startpre,in,startin,i-1);
                root.right = helper(pre,i-startin+startpre+1,endpre,in,i+1,endin);
            }
        }
        return root;
    }

}
