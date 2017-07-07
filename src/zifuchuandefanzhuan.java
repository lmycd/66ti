/**
 * Created by liunian on 2017/6/20.
 */

import java.util.Stack;

/**
 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 后来才意识到，这家伙原来把句子单词的顺序翻转了，
 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？*/
public class zifuchuandefanzhuan {
    public String ReverseSentence(String str) {
        //双指针，前后调换  错了 是句子中的单词逆置
//        if (str.length()==0)return "";
//        char[] strs = str.toCharArray();
//        int i = 0, j = strs.length-1;
//        while (i<j){
//            char temp = strs[j];
//            strs[j] = strs[i];
//            strs[i] = temp;
//            i++;
//            j--;
//        }
//        return  String.valueOf(strs);
        //更简单：将字符串按照空格划分为单词，将单词入栈，最后一个个出栈，拼接成字符串
        if (str.length()==0||str.trim().length()==0)return str;
       // if (str==" ") return " ";
        Stack<String> st = new Stack<>();
        String[] strings = str.split(" ");
        //System.out.println(strings.toString());
        for (String s :strings){
            st.push(s);
        }
        if (st.isEmpty()) return " ";
        StringBuffer rt = new StringBuffer();
        while (!st.isEmpty()) {
            rt.append(st.pop());
            rt.append(" ");
        }
        return rt.toString().trim();
    }

    public static  void main(String[] args){
        zifuchuandefanzhuan s =new zifuchuandefanzhuan();
        String ss = s.ReverseSentence("student. a am I");
        System.out.print(ss);
       // System.out.print(3);
    }
}
