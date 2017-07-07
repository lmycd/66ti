/**
 * Created by liunian on 2017/5/22.
 */
public class Juxingfugai {

    public int RectCover(int target) {

        if (target==1)return 1;
        if (target==2)return 2;
        return 1*RectCover(target-1) + 1*RectCover(target-2);
    }

    public static void main(String[] args){
        Juxingfugai j = new Juxingfugai();
        System.out.print(j.RectCover(4));
    }
}
