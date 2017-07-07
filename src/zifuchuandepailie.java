/**
 * Created by liunian on 2017/6/9.
 */
/**输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class zifuchuandepailie {
    ArrayList<String> rt = new ArrayList<>();
   // StringBuffer s = new StringBuffer();
    ArrayList<Character> ls = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str.length()==0)return new ArrayList<String>();
        else {
            ArrayList<Character> strs = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                strs.add(str.charAt(i));
            }
            return helper(strs, str.length());
        }
    }

    public ArrayList<String> helper( ArrayList<Character> str, int len){
        if (len==0){
            //while ()
            rt.add(changeString());
        }

        ArrayList<Character> used = new ArrayList<>();
        for (int i = 0 ; i < str.size() ; i++) {
            if (!used.contains(str.get(i)))
             {  used.add(str.get(i));
                ls.add(str.get(i));
                ArrayList<Character> temp = new ArrayList<Character>(str);
                temp.remove(i);
                helper(temp, len - 1);
                ls.remove(ls.size() - 1);
            }

        }
        return rt;
    }

    public static void main (String[] args){
        zifuchuandepailie sample = new zifuchuandepailie();
        System.out.print(sample.Permutation("aa").toString());
       // System.out.print(s.toString());

    }

    public String changeString(){
        Iterator it = ls.iterator();
        String rt = "";
        while (it.hasNext()){
            rt = rt+it.next();
        }
        return rt;
    }
}

