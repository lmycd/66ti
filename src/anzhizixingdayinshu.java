/**
 * Created by liunian on 2017/6/29.
 */
import java.util.*;
/**请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。**/
public class anzhizixingdayinshu {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        //因为是之字形，用一个栈，一个队列，都是按照先右再左的顺!!!!!!!!!错了 都得用栈，因为先访问的后出 必须用栈
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> q = new Stack<>();
        //Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> rt = new ArrayList<ArrayList<Integer>>();
        //一层队列保存，下一层由栈
        if (pRoot==null)return rt;
        s.add(pRoot);
        while (!s.isEmpty()||!q.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();

            while (!s.isEmpty()) {
                TreeNode t = s.pop();
                temp.add(t.val);
                if (t.left != null) q.add(t.left);
                if (t.right != null) q.add(t.right);
            }
            if (!temp.isEmpty())rt.add(new ArrayList<>(temp));

            ArrayList<Integer> temp1 = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode t = q.pop();
                temp1.add(t.val);
                if (t.right != null) s.add(t.right);
                if (t.left != null) s.add(t.left);
            }
            if (!temp1.isEmpty())rt.add(new ArrayList<>(temp1));
        }
        return rt;
    }
}
