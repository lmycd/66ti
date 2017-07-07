import javax.print.attribute.standard.NumberOfDocuments;

/**
 * Created by liunian on 2017/5/22.
 */
public class Erjinzhi {
    public int NumberOf1(int n) {
        int count = 0 ;
        int flag=1;
        //陷入死循环 因为 负数的补码表示 右移最高位补1啊，无限循环，改进 用1做移，最大的时候会溢出变为0
        while (flag!=0){
            int i = n&flag;
            if (i==flag)
                count += 1 ;
            flag=flag<<1;



        }
        return count;
    }
    public static void main(String[] args){
        Erjinzhi e = new Erjinzhi();
        int a =3 ;
       // System.out.println(1>>1);
      //  System.out.println(a);
        System.out.print(e.NumberOf1(9));
    }
}
