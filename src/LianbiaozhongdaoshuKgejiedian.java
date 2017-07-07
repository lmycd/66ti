/**
 * Created by liunian on 2017/5/23.
 */
public class LianbiaozhongdaoshuKgejiedian {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null||k<=0)return null;
        ListNode tou = new ListNode(0);
        ListNode dup = tou;
//        tou.next = head;
//        while (head !=null){
//            tou.next = head.next;
//            head.next = head.next.next ;
//            tou.next.next =head;
//            tou = tou.next;
//            head = head.next;
//        }
//        int i =0;
//        while (i<k){
//            dup = dup.next;
//        }
//        return dup;
        ListNode first = head;
        ListNode sc = head;
        int i = 0;
        while (i<k-1){
            if (first.next!=null){
            first = first.next;
            i++;}
            else return null;
        }
        while (first!=null){
            first = first.next;
            sc = sc.next;
        }
        return sc;
    }
}
