/**
 * Created by liunian on 2017/6/20.
 */
/**
 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！*/
public class zuoxuanzhuanzifuchuan {
    public String LeftRotateString(String str,int n) {
        //法1：
        if (str.length()==0)return "";
        n = n%str.length();
        String qian = str.substring(0,n);
        String hou = str.substring(n);
        return hou+qian;

    }
    public static  void main(String[] args){
        zuoxuanzhuanzifuchuan s = new zuoxuanzhuanzifuchuan();
        String sss = s.LeftRotateString("xyzdefabc",9);
        System.out.print(sss);
    }
}
