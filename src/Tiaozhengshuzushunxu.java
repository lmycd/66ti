/**
 * Created by liunian on 2017/5/23.
 */
import java.util.*;
public class Tiaozhengshuzushunxu {
    public void reOrderArray(int [] array) {
        List<Integer> s =  new ArrayList<>();
        List<Integer> a=  new ArrayList<>();
        for (int i =0 ; i<array.length;i++){
            if (array[i]%2==0)
                s.add(array[i]);
            else
                a.add(array[i]);

        }
        int i = 0;
        while (i<a.size()){
            array[i] = a.get(i);
            i++;
        }

        while (i<array.length){
            array[i] = s.get(i-a.size());
            i++;
        }
    }
}
