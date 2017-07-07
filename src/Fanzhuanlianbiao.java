/**
 * Created by liunian on 2017/5/23.
 */
public class Fanzhuanlianbiao {
    public ListNode ReverseList(ListNode head) {
        if (head==null||head.next == null)return head;
        ListNode tou = new ListNode(0);
        ListNode dup = tou;
        tou.next = head;
        ListNode p = head.next;
        head.next = null;
        while (p!=null){
            tou.next = p;
            ListNode temp = p.next;
            p.next = head;
            p = temp;
            head = tou.next;
        }
      return dup.next;
    }
}
