/**
 * Created by liunian on 2017/6/28.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 */
public class zifuchuanzhuanhuaweizhnegshu {
    public int StrToInt(String str) {
        //'4'用int变换等于52 ，变为ascii码，添加一个辅助数组最好，摆放0-10的字符对应的数字
        //或者直接'4' - '0'
        //不需要查ascii吗 直接用>'0' <'9'代替就可以，字符转为数字，直接减去'0'或者48，
        //这么像 -  为数字运算符， 无论怎么变化都是转化为asc吗来加减，因为asc是数字 ，所以'4'-'0'为4
        if (str.length()==0||str==null)return 0;
        int sum =0;
        char[] zifu = str.toCharArray();
        int[] shuzi = new int[10];
        for (int i =0 ; i< 10;i++){

            shuzi[i]=i;
        }
     //   Stack<Integer> s = new Stack<>();
        List<Integer> s = new ArrayList<>();
        System.out.println((int)'4');
        if (zifu[0]>=48&&zifu[0]<=57) {
            System.out.println("开头为数字");
            System.out.println('4'-48);
            for (int i = 0; i < zifu.length; i++) {
                if (zifu[i] >= 48 && zifu[i] <= 57) {
                    s.add(shuzi[zifu[i]-48]);
                } else
                    return 0;
            }
            int i = 0;
            while (i < s.size()) {
                sum = sum * 10 + s.get(i);
                i++;
            }
            return sum;
        }
        if (zifu[0]=='+'||zifu[0]=='-'){
            System.out.println("- + 号");
            if (zifu.length>1) {

                for (int i = 1; i < zifu.length; i++) {
                    if (zifu[i] >= 48 && zifu[i] <= 57) {
                        s.add(shuzi[zifu[i]-48]);
                    } else
                        return 0;
                }
                int i = 0;
                while (i < s.size()) {
                    sum = sum * 10 + s.get(i);
                    i++;
                }
                return zifu[0] == '-' ? -sum : sum;
            }
            else return 0;

        }
        else return 0;

    }

    public static void main(String[] args){
        zifuchuanzhuanhuaweizhnegshu s = new zifuchuanzhuanhuaweizhnegshu();
        System.out.print(s.StrToInt("45432"));
    }
}
