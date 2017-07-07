/**
 * Created by liunian on 2017/6/19.
 */
/**
 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 请写程序找出这两个只出现一次的数字*/

public class shuzuzhongzhichuxianyicideshuzi {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //法1：hashtable，选key为1的
        //法2：异或操作 相同为0 ，相异为1,异或操作满足交换律
        //先用异或操作，得到两个只出现一次数字的异或结果，然后再这个数字找到第一个不为0的位置，用这个位置将数字一分为二，
       if (array==null||array.length==0){
           num1[0]=0;
           num2[0]=0;
           return;
       }
        int rt = 0;
        for (int i = 0 ; i < array.length ; i++){
            rt ^= array[i];
        }
        int i=0;
        for (  ; i < 32 ; i++){
            if ((rt&(1<<i))!=0) break;
        }


        for (int j = 0 ; j < array.length ; j++){
            if ((array[j]&(1<<i))==(1<<i))
                num1[0] ^=array[j];
            else num2[0] ^= array[j];
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);
        return ;
    }

    public static void main(String[] args){
        shuzuzhongzhichuxianyicideshuzi s= new shuzuzhongzhichuxianyicideshuzi();
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1={0};
        int[] num2={0};
        s.FindNumsAppearOnce(array,num1,num2);
    }
}
