/**
 * Created by liunian on 2017/6/19.
 */
/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 输出描述:
 对应每个测试案例，输出两个数，小的先输出。*/
import java.util.ArrayList;
import java.util.HashMap;
import  java.util.Map;

public class heweisdelianggeshuzi {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        //递增的数组，从左到右 找出第一对，因为递增 两个数相差越小，乘机越大
        ArrayList<Integer> rt = new ArrayList<>(2);
        Map<Integer,Integer> map = new HashMap<>();
        //在hashtable里，第一对，代表着最后一次map匹配成功；
        for (int i = 0 ;i<array.length;i++){
            if (map.containsKey(array[i])) {
                if (rt.size()==0){
                rt.add(map.get(array[i]));
                rt.add(array[i]);}
                else {
                rt.set(0,map.get(array[i]));
                rt.set(1,array[i]);}
            }
            else map.put(sum-array[i],array[i]);
        }
        return rt;
        //法2：双指针，左右两边逼近，i++，j--；空间复杂度小了点
    }
}
