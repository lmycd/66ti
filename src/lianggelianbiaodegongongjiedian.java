import java.util.Stack;

/**
 * Created by liunian on 2017/6/15.
 */
public class lianggelianbiaodegongongjiedian {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //法1：暴力匹配 o(nm)时间复杂度
//        ListNode p1=pHead1;
//        ListNode p2=pHead2;
//        while (pHead1!=null){
//            pHead2=p2;
//            while (pHead2!=null){
//                if (pHead1==pHead2)
//                    return pHead1;
//                else pHead2=pHead2.next;
//            }
//            pHead1=pHead1.next;
//        }
//        return pHead1;
        //法2：如果有公共部分最后的部分一定是相同的，将两个链表入栈，一起出栈，直到遇到两个不同的节点
        Stack<ListNode> l1 = new Stack<>();
        Stack<ListNode> l2 = new Stack<>();
        Stack<ListNode> l3 = new Stack<>();
        while (pHead1!=null){
            l1.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2!=null){
            l2.add(pHead2);
            pHead2 = pHead2.next;
        }

        while (!l1.empty()&&!l2.empty()&&l1.peek()==l2.peek()){
            l3.add(l1.pop());
            l2.pop();
        }
        return l3.peek();
    }
}
