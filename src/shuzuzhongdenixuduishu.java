/**
 * Created by liunian on 2017/7/2.
 */
/**在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 输入描述:
 题目保证输入的数组中没有的相同的数字
 数据范围：
 对于%50的数据,size<=10^4
 对于%75的数据,size<=10^5
 对于%100的数据,size<=2*10^5*/
public class shuzuzhongdenixuduishu {
    //归并排序，归并排序是稳定排序，在大量数据的时候，比快排慢一点，算快的，用了分治的方法 ，不停的二分，最重要的是合并的时候
    //合并，对两个有序序列排序，只需要o（n）的时间复杂度，算快的，可以采用数组赋值的方式先建立一个备用数组，两个序列中比较小的元素放进去
    //最后再赋值进去  o（n）
    int cnt = 0;
    public int InversePairs(int [] array) {
        int[] temp=new int[array.length];
        if (array.length==0)
            return 0;
        else {
        helper(array,0,array.length-1,temp);
        return cnt;
        }
    }

    public void helper(int[] array ,int start ,int end,int[] temp ){
        if (end>start){
            int mid = (start+end)>>1;
            helper(array,start,mid,temp);
            helper(array,mid+1,end,temp);
            merge(array,start,mid,end,temp);
        }
    }

    public void merge(int[] array ,int start,int mid ,int end,int[] temp){ //z]]]
        //int[] temp = new int[end-start+1]; //在merge操作分配临时数组，一旦数组的大小特别大的话也特别费时间，可以指创建一个数组
        //时间确实减少了 从830ms降到660ms ，省去了new 数组的开销，真的jb烦，写错了一个参数 浪费我这么长的时间 qnmlgb
        int i = start,j=mid+1,k=0;
        while (i<=mid&&j<=end){
            if (array[i]>array[j]){
                cnt += mid-i+1;
                cnt%=1000000007;//注意一处
                temp[k++] = array[j++];
            }
            else {
                temp[k++] = array[i++];
            }
        }

        while (i<=mid){
            temp[k++] = array[i++];
        }
        while (j<=end){
            temp[k++] = array[j++];
        }

        for ( i = 0 ; i <k ;i++){
            array[i+start] = temp[i];
        }
    }

    public static void main(String[] args ){
        shuzuzhongdenixuduishu s = new shuzuzhongdenixuduishu();
        int[] n  = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(s.InversePairs(n));
    }

}
