package Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Java2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);//洗牌机制
        Collections.reverse(list);//反向
        Collections.addAll(list,57,70);//追加
        System.out.println(list);
    }
}
