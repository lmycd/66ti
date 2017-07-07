/**
 * Created by liunian on 2017/6/22.
 */

import java.util.ArrayList;

/**每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。
 * 然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
 * 然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....
 * 直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1**/
public class haizimendeyouxi {

    public int LastRemaining_Solution(int n, int m) {
        //选用ArrayList是因为好删除元素，
        ArrayList<Integer> ls = new ArrayList<>();
        if (n==0||n==1 )return n;
        for (int i=0; i<n;i++){
            ls.add(i);
        }
        int index=0;
        //找到小朋友就删除，用当前下标+m-1取模，模为当前list的长度
        while (ls.size()!=1){
            int s = index+m-1;
             index = s%ls.size();
            ls.remove(index);
        }
        return ls.get(0);

        //类似于约瑟夫换
        //递归 f(n,m) = f(n-1,m)的逆置 = (f(n-1,m)+k+1)%n =(f(n-1,m)+m)%n   k=(m-1)%n
        //n个数，转m次 得到的结果 与n-1，m的逆置结果一样
        //很想循环列表
    }
}
