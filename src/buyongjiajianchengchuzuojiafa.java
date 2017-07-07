/**
 * Created by liunian on 2017/6/28.
 */
public class buyongjiajianchengchuzuojiafa {
    public int Add(int num1,int num2) {
        //不算进位相加的结果与进位的结果相加就是结果,不算进位是异或操作，进位是与操作左移一位
        while (true) {
            int sum1 = num1 ^ num2;
            int sum2 = (num1 & num2) << 1;
            if (sum2 == 0) return sum1;
            else {
                num1 = sum1;
                num2 = sum2;
            }
        }

    }


    public static void main(String[] args){
        buyongjiajianchengchuzuojiafa s  = new buyongjiajianchengchuzuojiafa();
        System.out.print(s.Add(1,3));
    }

}
