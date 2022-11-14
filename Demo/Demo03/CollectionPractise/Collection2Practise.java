package CollectionPractise;

import java.util.ArrayList;

/**
 * 写一个方法reverseList，该函数能够接受一个List，然后把该List 倒序排列
 */
public class Collection2Practise {
    public static void main(String[] args){
        String[] str = {"I","Love","you","java","learn"};
        ArrayList a = new ArrayList();
        for (int i = 0; i < str.length; i++) {
            a.add(str[i]);
        }

        System.out.println(a);
        System.out.println();
        ArrayList a1 = R(a);
        System.out.println(a1);
        System.out.println();
        ArrayList a2 = T(a1);
        System.out.println(a2);
    }

    public static ArrayList<String> R(ArrayList<String> A){
        for (int i = A.size() - 1; i >= 0; i--) {
            A.add(A.get(i));
        }
        return A;
    }

    public static ArrayList<String> T(ArrayList<String> A){
        for (int i = (A.size()/2) - 1; i >= 0; i--) {
            A.remove(i);
        }
        return A;
    }
}
