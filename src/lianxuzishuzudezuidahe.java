/**
 * Created by liunian on 2017/6/14.
 */
public class lianxuzishuzudezuidahe {
    public int FindGreatestSumOfSubArray(int[] array) {
        //分治：nlogn
        //dp应该也可以做，时间复杂度未知，用二维数组
        //运用一个数组，o(n)时间复杂度
        int max = Integer.MIN_VALUE;
        int temp=0;
        for (int i = 0 ; i< array.length;i++){
            if (temp<0)
                temp=array[i];
            else
                temp+=array[i];
            max = Math.max(max,temp);
        }
        return max;

    }
}
