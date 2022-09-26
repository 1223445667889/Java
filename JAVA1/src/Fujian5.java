public class Fujian5 {

    //学生管理类
    /**
     * 学生数组
     */
    /*String[] names = new String[5];
    int[] ids = new int[5];
    int[] ages = new int[5];
    int[] scores = new int[5];*/
    /**
     * 增加学生
     */
    /*public void addStudent(int id,String name,int age,int score){
        for (int i=0;i < names.length;i++) {
            if(names[i]==null){
                names[i]=name;
                ids[i] = id;
                ages[i] = age;
                scores[i] = score;
                break;
            }
        }
    }*/
    /**
     * 显示所有学生信息
     */
    /*public void showStudent(){
        System.out.println("学生信息：");
        for (int i = 0; i < names.length; i++) {
            if(names!=null) System.out.println(ids[i]+"\t"+names[i]+"\t"+ages[i]+"\t"+scores[i]+"\t");
        }
    }*/



    //升级版
    /**
     * 学生数组
     */
    Student5[] sts = new Student5[5];
    /**
     * 增加学生
     */
    public void addStudent(Student5 st){
        for (int i=0;i < sts.length;i++) {
            if(sts[i]==null){
                sts[i]=st;
                break;
            }
        }
    }
    /**
     * 显示所有学生信息
     */
    public void showStudent(){
        System.out.println("学生信息：");
        for (int i = 0; i < sts.length; i++) {
            if(sts[i]!=null) System.out.println(sts[i].toString());
        }
    }

}
