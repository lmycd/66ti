/**
 * Created by liunian on 2017/6/13.
 */

/**数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。*/
//异或 相同为0 相异为1
    //法1 ：哈希表 o(n) time o(n) 空间复杂度
    // 摩尔投票：
public class shuzizhongchuxiancishuchaoguoyibande {
    public int MoreThanHalfNum_Solution(int [] array) {
        int cnt = 0 , candidate = 0;
        for (int i :array){
            if (candidate==i)
                cnt+=1;
            else if (cnt!=0)
                cnt-=1;
            if (cnt==0) {
                candidate = i;
                cnt=1;
            }
        }
        //再遍历一边数组，查看元素是否合法
        int count = 0;
        for (int i : array)
        {
            if (candidate==i)
                count++;
        }
        if (count*2>array.length)
            return candidate;
        else return 0;

    }
}

