package Text;

import org.junit.Test;

import java.util.*;

public class Java1 {
   @Test
    public void f01(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("遍历方式");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
       System.out.println("\n遍历方式");
       for (Integer i : list) {
           System.out.println(i+" ");
       }
    }

    @Test
    public void f02(){
        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("\n遍历方式");
        for (Integer i : list) {
            System.out.println(i+" ");
        }
    }

    @Test
    public void f03(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("\n遍历方式");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }

}
