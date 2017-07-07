/**
 * Created by liunian on 2017/7/3.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。**/
public class bashuzupaichengzuixiaodeshu {
    public String PrintMinNumber(int [] numbers) {
//        ArrayList<String> strs = new ArrayList<>() ;
//        for (int i=0 ; i<numbers.length;i++){
//            String s = String.valueOf(numbers[i]);
//            strs.add(s);
//        }
////        int index=
//        while (strs.size()!=0){
//            for (int i=0 ; i< strs.size() ; i++){
//                if (strs.get(i))
//            }
//        }
        //上述方法做不出来，一个个的遍历从第一个字母比较，没想通的还好，有相同的太麻烦
        //方法：用数组的排序，可以自己拟定排序规则，a+b<b+a 意味着a<b
       // ArrayList<Integer> strs = new ArrayList<>();
        String[] strs = new String[numbers.length];
        for(int i = 0; i < numbers.length ;i++){
            String s = String.valueOf(numbers[i]);
            strs[i]=s;
        }
        StringBuffer rt = new StringBuffer();
        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;

                if (Integer.parseInt(a) < Integer.parseInt(b))
                    return -1;
                else if (Integer.parseInt(a) == Integer.parseInt(b))
                    return 0;
                else return 1;
                //hjkjl        return a.compareTo(b);
            }
        };
        Arrays.sort(strs, cmp);

        for (String s :strs){
            rt.append(s);

        }
        return rt.toString();

    }

    public static void main(String[] args){
        bashuzupaichengzuixiaodeshu s = new bashuzupaichengzuixiaodeshu();
        int[] r = {3,32,321};
        System.out.println(s.PrintMinNumber(r));
    }
}
