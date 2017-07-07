/**
 * Created by liunian on 2017/6/26.
 */
/**给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。*/
public class erchashudexiayigejiedian {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        //如果次节点有有节点，则返回右节点
        //没有右节点，判断左右节点

        if (pNode.right!=null){
            TreeLinkNode right = pNode.right;
            while (right.left!=null){
                right = right.left;
            }
            return right;
        }

        TreeLinkNode fa =pNode.next;
        if (fa==null) return null;
        if (fa.left==pNode)
            return fa;
        else if (fa.next!=null){
            TreeLinkNode faa = fa.next;
            if (faa.left ==fa)
                return faa;
            else {
                while (faa.next != null) {
                    TreeLinkNode  faaa = faa.next;
                    if (faaa.left==faa)
                        return faaa;
                    else faa = faaa;
                }
                return null;
            }

        }
        else return null;



    }
}
