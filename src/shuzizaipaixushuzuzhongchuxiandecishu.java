/**
 * Created by liunian on 2017/6/15.
 */
public class shuzizaipaixushuzuzhongchuxiandecishu {
    public int GetNumberOfK(int [] array , int k) {
//        //遍历
//        int count = 0;
//        for (int i = 0 ; i < array.length ; i++){
//            if (k==array[i])
//                count++;
//
//        }
//        return count;
        //分治，递归
        //合并
       return helper(0,array.length-1,k,array);

    }

    public int helper(int start,int end,int k,int[] array){
        if (end<start) return 0;
        int mid = start+(end-start)/2;
        if (array[mid]==k)
            return 1+helper(start,mid-1,k,array)+helper(mid+1,end,k,array);
        else
            if (array[mid]>k)
            return helper(start,mid-1,k,array);
        else return helper(mid+1,end,k,array);

    }
}
