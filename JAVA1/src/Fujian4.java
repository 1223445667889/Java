public class Fujian4 {
    //狮子
/*    String color="黄色";

    public void run(){
        System.out.println(color+"的狮子再跑");
    }

    public void jiao(){
        System.out.println(color +"的狮子在咆哮");
    }

    public String robBall(){
        return "球";
    }

    public String getColor() {
        return color;
    }

    public String show(){
        return "这是一个"+getColor()+"的玩具狮子";
    }

    */



    //各科成绩的总和与平均值
    /*int java;
    int c;
    int db;

    public void sum(){
        System.out.println("总和:"+(java+c+db));
    }

    public void average(){
        System.out.println("平均值为:"+((java+c+db))*1.0/3);
    }*/


    //圆
    /*double r;
    public void c(){
        System.out.println("圆的周长为:"+2*3.14*r);
    }
    public void s(){
        System.out.println("圆的面积为:"+3.14*r*r);
    }*/


    //果汁

    /**
     *
     * @param source  材料
     * @return  材料汁
     */
    /*public String zhazhi(String source){
        return source + "汁";
    }*/


    //学生管理表
    /**
     * 学生数组
      */
    String[] names = new String[5];
    /**
     * 增加姓名
     */
    public void addName(String name){
        for (int i = names.length - 1; i >= 0; i--) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    /**
     * 显示所有学生姓名
     */
    public void show(){
        for (String n : names) {
            if(n!=null) System.out.println(n);
        }
    }

    /**
     * 在指定下标范围内查询姓名存在
     * @param stert  起始下标（包含）0
     * @param end   结束下标（不包含）5
     * @param name
     * @return
     */
    public boolean findName(int stert,int end,String name){
        for(int i = stert;i<end;i++){
            if(name.equals(names[i]))  return true;
        }
        return false;
    }
}
