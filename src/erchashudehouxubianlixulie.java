import java.util.Arrays;

/**
 * Created by liunian on 2017/6/8.
 */
public class erchashudehouxubianlixulie {
    //更简单的方法helper函数传递数组和前后两端的下标，这样就省去了数组拷贝的开销
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0)return false;
        int len = sequence.length;
        int root = sequence[len-1];
        int[] s = Arrays.copyOfRange(sequence,0,len-1);
        return helper(s,root);
    }

    public boolean helper(int[] s ,int root){
        if (s.length==1||s.length==0) return true;

        int i = 0;
        int index = 0;
        while (i<s.length){
            if (s[i]>root){
                index = i;
                break;
            }
            i++;
        }
        while (i<s.length){
            if (s[i]<root)
                return false;
            i++;
        }

        if (index==s.length-1||index==0)
            return helper(Arrays.copyOfRange(s,0,s.length-1),s[s.length-1]);
        else return helper(Arrays.copyOfRange(s, 0,index-1),s[index-1]) &&helper(Arrays.copyOfRange(s,index,s.length-1),s[s.length-1]);


      //  return helper(s,s[index-1]) && helper(s,s[s.length-1]);
    }
}
