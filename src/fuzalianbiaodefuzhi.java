/**
 * Created by liunian on 2017/6/8.
 */

import java.util.HashMap;
import java.util.Map;
/**输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）*/
public class fuzalianbiaodefuzhi {
    public RandomListNode Clone(RandomListNode pHead)
    {
//        RandomListNode Head = pHead;
//        RandomListNode head = new RandomListNode(0);
//        RandomListNode dummy = head;
//        Map<RandomListNode,RandomListNode> map = new HashMap<>();
//        while (Head!=null){
//
//            RandomListNode rd = new RandomListNode(Head.label);
//
//            map.put(Head.random,rd);
//            dummy.next = rd;
//            dummy = rd;
//            Head = Head.next;
//        }
//        dummy.next = null;
//         dummy = head.next;
//
//        while (pHead!=null){
//            if (map.get(pHead)==null)
//                dummy.random=null;
//            else
//            map.get(pHead).random = dummy;
//            dummy =dummy.next;
//            pHead = pHead.next;
//
//        }
//        return head.next;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode Head = pHead;
        while (Head!=null){
            map.put(Head,new RandomListNode(Head.label));
            Head = Head.next;
        }
        map.put(null,null);//可以不加这个  因为 api里写着get方法 如果找不到key就返回null
       // RandomListNode dum = new RandomListNode(0);
        /**get(Object key)
         Returns the value to which the specified key is mapped,
         or null if this map contains no mapping for the key.*/
        RandomListNode p = map.get(pHead);
        RandomListNode rt = p;
        while (pHead!=null) {
                p.next = map.get(pHead.next);
                p.random = map.get(pHead.random);
                pHead = pHead.next;
                p = p.next;

        }
        return rt;

    }
}
