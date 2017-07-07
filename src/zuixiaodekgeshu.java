/**
 * Created by liunian on 2017/6/14.
 */
/***输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。*/
import java.util.ArrayList;
import java.util.Arrays;

public class zuixiaodekgeshu {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        //方法1：排序
//        Arrays.sort(input);
//        ArrayList<Integer> rt = new ArrayList<>();
//        if (k>input.length)return rt;
//        for (int i = 0 ; i < k;i++){
//            rt.add(input[i]);
//        }
//        return rt;
        //方法2：时间复杂度o(kn),对于新的值，判断是否比当前的k个值小，如果小，就代替，并且把最大的扔出去
        //同样时间复杂度，思路类似的方法：冒泡排序，拍一次出一个最小值，排k次就行了

        ArrayList<Integer> rt = new ArrayList<>();
        if (k > input.length) return rt;
        for (int i = 0; i < input.length; i++) {
            if (rt.size() < k)
                rt.add(input[i]);
            else {
                int key = input[i];
                for (int j = 0; j < k; j++) {
                    if (key < rt.get(j)) {
                        int temp = rt.get(j);
                        rt.set(j, key);
                        key = temp;
                    }

                }
            }
        }
        return rt;
        //方法3；基于方法2的改进，在于新值与已有的答案比对，运用堆的数据结构，比较的时间复杂度n(logk),缩短了时间
        //不会写，以后再说
    }
}
