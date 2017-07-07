/**
 * Created by liunian on 2017/6/26.
 */
/**在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5*/
public class shanchulianbiaozhongchongfudejiedian {
    public ListNode deleteDuplication(ListNode pHead)
    {
        //一个temp保存当前的节点的value,节点的值与temp相同就删除，不同就更新
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode p = head;
       // int temp=0;
        while (pHead!=null&&pHead.next!=null){
            if (pHead.val ==pHead.next.val){
                ListNode q = pHead.next;
                while (q.next!=null&&q.next.val==q.val){
                        q = q.next;
                }
                p.next = q.next; ///
                pHead =q.next;
            }
            else {pHead = pHead.next;
            p = p.next;}
        }
        return head.next;
    }
}
