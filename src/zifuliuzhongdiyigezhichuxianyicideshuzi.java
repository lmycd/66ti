/**
 * Created by liunian on 2017/6/24.
 */
/**
 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。*/
public class zifuliuzhongdiyigezhichuxianyicideshuzi {
    int[] map = new int[257];
    StringBuffer s = new StringBuffer();
    public void Insert(char ch)
    {

        s.append(ch);
        if (map[ch]==0)
            map[ch]=1;
        else map[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        //法1：先遍历建立哈希表，value为出现的次数，第二次遍历，找第一个为1的字符，
        //这边可以用简单的方法：用数组来建立模拟哈希表，因为char型为8位，有256种可能建立一个大小为257的数组

        String ss = s.toString();
        for (int i = 0 ; i < ss.length() ; i++){
            if (map[ss.charAt(i)]==1)
                return ss.charAt(i);
        }
        return '#';
    }
}
