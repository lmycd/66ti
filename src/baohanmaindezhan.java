/**
 * Created by liunian on 2017/5/31.
 */
import java.util.Stack;
public class baohanmaindezhan {
    //两个栈一个栈正常保存数据，另一个栈保存当前最小的数据；
    Stack<Integer>  sta = new Stack<>();
    Stack<Integer>  minsta = new Stack<>();
    public void push(int node) {
        sta.push(node);
        if(minsta.isEmpty()||minsta.peek()>=node){
            minsta.push(node);
        }
    }

    public void pop() {

        int s = sta.pop();
        if (s==minsta.peek())
            minsta.pop();
    }

    public int top() {
        return sta.peek();
    }

    public int min() {
        return minsta.peek();

    }
}
