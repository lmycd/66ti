/**
 * Created by liunian on 2017/7/3.
 */
/**把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。*/
import java.util.*;
public class choushu {
    public int GetUglyNumber_Solution(int index) {
        //一个丑数一定是前面的某个丑数*2 或者3 或者5得来的/最重要的是当前的丑数*2或者*3 *5之后的结果都会在后面的序列中出现
        if (index<7)
            return index;
        int t2=0;
        int t3=0;int t5=0;
        int[] rt = new int[index];
        rt[0]=1;
        for (int i=1; i<index;i++){
            int min = Math.min(rt[t2]*2,Math.min(rt[t3]*3,rt[t5]*5));  //2*3 和 3*2 如何证明是同时发生的
            if (min==rt[t2]*2) t2++;
            if (min==rt[t3]*3) t3++;
            if (min ==rt[t5]*5) t5++;
            rt[i] = min;
        }
        return rt[index-1];

    }
}
