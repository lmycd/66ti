/**
 * Created by liunian on 2017/6/28.
 */
public class qiu1 {
    public int Sum_Solution(int n) {
        //return n<=0?0:n+Sum_Solution(n-1);
        //return n+Sum_Solution(n-1);

        //看错了 不能使用3目运算符，那递归的停止条件如何写呢
        int ans = n;
        boolean s = (ans>0)&& ((ans+=Sum_Solution(n-1))>0);
        return ans;

    }
}
