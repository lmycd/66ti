/**
 * Created by liunian on 2017/6/27.
 */
/**从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。**/

import   java.util.*;
public class baerchashudayinchengduohang {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        //用队列来做
        ArrayList<ArrayList<Integer>> rt = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if (pRoot!=null)q.add(pRoot);
        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            Queue<TreeNode> ql = new ArrayDeque<>();
            while (!q.isEmpty()) {
                TreeNode t = q.poll();
                l.add(t.val);
                if (t.left != null) ql.add(t.left);
                if (t.right != null) ql.add(t.right);
            }
            rt.add(new ArrayList<>(l));
            q = ql;
        }
        return rt;
    }
}
