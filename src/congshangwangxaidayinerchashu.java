/**
 * Created by liunian on 2017/6/1.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
/**从上往下打印出二叉树的每个节点，同层节点从左至右打印。**/
public class congshangwangxaidayinerchashu {
    Queue<TreeNode> t = new LinkedList<TreeNode>();
    ArrayList<Integer> rt  =new ArrayList<>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null)return rt;
        else
            t.offer(root);
        while (!t.isEmpty()){
            TreeNode s = t.poll();
            rt.add(s.val);
            if (s.left!=null)
                t.offer(s.left);
            if (s.right!=null)
                t.offer(s.right);

        }
        return rt;

    }




}
