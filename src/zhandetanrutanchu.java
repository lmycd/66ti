/**
 * Created by liunian on 2017/5/31.
 */
/**输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）*/;
import java.util.Stack;
public class zhandetanrutanchu {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        //用一个辅助栈就可以实现 ,按照人类的思路 先观察出战序列 ，找出第一个出战元素，进展在出战，直到辅助栈为空
        Stack<Integer> sta = new Stack<>();
        int i=0,j=0;
        while (i<pushA.length) {
            sta.push(pushA[i]);
            while (!sta.isEmpty()) {
                if (sta.peek() == popA[j]) {
                    sta.pop();
                    j++;
                }
                else
                    break;
            }
            i++;
        }
        if (sta.isEmpty())
            return true;
        else return false;
    }
}
