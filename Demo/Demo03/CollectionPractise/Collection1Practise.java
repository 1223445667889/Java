package CollectionPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 已知有十六支男子足球队参加2008 北京奥运会。
 * 写一个程序，把这16支球队随机分为4个组。采用List集合和随机数
 * 2008 北京奥运会男足参赛国家：
 * 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，
 * 中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
 *
 */
public class Collection1Practise {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("科特迪瓦");
        l.add("阿根廷");
        l.add("澳大利亚");
        l.add("塞尔维亚");
        l.add("荷兰");
        l.add("尼日利亚");
        l.add("日本");
        l.add("美国");
        l.add("中国");
        l.add("新西兰");
        l.add("巴西");
        l.add("比利时");
        l.add("韩国");
        l.add("喀麦隆");
        l.add("洪都拉斯");
        l.add("意大利");

        for (String s : l) {
            System.out.println(s+" ");
        }
        Random random = new Random();
        String member;
        for(int i=0;i<4;i++){
            System.out.print("第"+(i+1)+"组: ");

            for(int j=0;j<4;j++){
                member= l.get(random.nextInt(l.size()));//int x=new Random.nextInt(100); 则x为一个0~99的任意整数
                l.remove(member);
                System.out.print(member+" ");
            }
            System.out.println();
        }
    }
}
