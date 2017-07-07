/**
 * Created by liunian on 2017/5/23.
 */
public class Hebinglianggepaixulianbiao {

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode p= head;
        head.next = null;
        while (list1!=null&&list2!=null)
        {
        if (list1.val<list2.val){
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        else
        {
            head.next = list2;
            list2 = list2.next;
            head = head.next;
        }
        }

        if (list1==null){
            head.next = list2;
        }
        else
            head.next =list1;
        return p.next;
    }
}
