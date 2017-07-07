/**
 * Created by liunian on 2017/6/23.
 */
/**给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。*/
public class goujianchengjishuzu {
    public int[] multiply(int[] A) {
        //法1：乘积看成两部分，左半部分和右半部分
        int[] b = new int[A.length];
        //左半部分
        if (A.length==0)return b;
        b[0]=1;
        for (int i = 1 ; i < A.length ; i++){
            b[i] = b[i-1]*A[i-1];
        }

        //右半部分
        int temp=1;
        for (int i = A.length-2 ; i >=0 ;i--){
            temp = temp*A[i+1];
            b[i] = b[i]*temp;
        }
        return b;

        //dp,



    }
}
