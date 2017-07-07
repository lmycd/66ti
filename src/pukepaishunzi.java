/**
 * Created by liunian on 2017/6/29.
 */

import java.util.Arrays;

/**LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！“
 * 红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 * LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。*/
public class pukepaishunzi {
    public boolean isContinuous(int [] numbers) {
        //题目由两种意思；1、数组的元素顺序得按下表来。2、数字可以随机组合，没有顺序
        //1、先做没有顺序的简单点
        int cnt=0;
        if (numbers.length==0)return false;
        Arrays.sort(numbers);
        for (int i =0 ; i < numbers.length-1;i++){
            if (numbers[i]==0)
                cnt++;
            else
            {   int c = numbers[i+1]-numbers[i]-1;
                if (c<0)return false;
                if (c!=0)
                    cnt = cnt-c;
                if (cnt<0)
                    return false;

            }
        }
        return true;



    }

    public static void main(String[] args){
        int[] a = {1,0,5,0,0};
        pukepaishunzi s = new pukepaishunzi();
        System.out.println(s.isContinuous(a));
    }
}
