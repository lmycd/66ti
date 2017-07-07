/**
 * Created by liunian on 2017/6/14.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**在一个字符串(1<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置*/
public class diyigezhichuxianyicideshuzi {
    public int FirstNotRepeatingChar(String str) {
//        //构建hash表，value为出现的次数，然后将value出现次数为1的独立出来
//        //比哈希表更屌的数据结构是数组，数组更方便：前提是字母的原因，很简单字母有唯一的ascaii码，有数字代替，数字可以变为数组的下标
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0;i<str.length();i++){
//            if (map.containsKey(str.charAt(i)))
//                map.put(str.charAt(i),map.get(str.charAt(i))+1);
//            else
//                map.put(str.charAt(i),1);
//        }
//        //傻逼了 不需要检测出value为1的，直接遍历的时候检测是否为1不就行了
//
//        ArrayList<Character> cans = new ArrayList<>();
//        for (Character i :map.keySet()){
//            if (map.get(i)==1)
//                cans.add(i);
//
//        }
//        for (int i = 0;i<str.length();i++){
//            if (cans.contains(str.charAt(i)))
//                return i;
//        }
//        return -1;
        //法2：
        char[] c = str.toCharArray();
        int[] a = new int['z'+1];//否则越到z会数组下标会过界
        for (char i:c){
            a[(int)i]++;
        }
        for (int i = 0 ; i< c.length;i++){
            if (a[(int)c[i]]==1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        diyigezhichuxianyicideshuzi s = new diyigezhichuxianyicideshuzi();
        System.out.print(s.FirstNotRepeatingChar("google"));
    }
}
