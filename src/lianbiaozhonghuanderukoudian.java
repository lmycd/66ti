import java.util.ArrayList;
import java.util.List;
/**
 * Created by liunian on 2017/6/24.
 */
//一个链表中包含环，请找出该链表的环的入口结点。/
public class lianbiaozhonghuanderukoudian {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        //法1：用Arraylist，将节点存入，有新的节点就判断是否已经存在，找到第一个已经存在的就是入口节点；
        List<ListNode> ls = new ArrayList<>();
        while (pHead!=null)
        {   if (ls.contains(pHead))
                return pHead;
            ls.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }
}
