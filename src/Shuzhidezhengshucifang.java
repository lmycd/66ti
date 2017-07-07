/**
 * Created by liunian on 2017/5/23.
 */
public class Shuzhidezhengshucifang {
    public double Power(double base, int exponent) {
        double sum = 1 ;
        int n = 0;
        if (exponent>=0){
        while (n<exponent){
            sum = base *sum;
            n++;
        }
        return sum;}
        else while (n<Math.abs(exponent)){
            sum = (1/base)*sum;
            n++;
        }
        return sum;
    }
}
