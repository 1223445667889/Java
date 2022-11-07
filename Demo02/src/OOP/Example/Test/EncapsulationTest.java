package OOP.Example.Test;

public class EncapsulationTest {

        public String name;
        private int age;
        private double salary;
        private String job;

    public EncapsulationTest(){}

    public EncapsulationTest(String name, int age, double salary, String job) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.job = job;
        setName(name);
        setAge(age);
        setSalary(salary);
        setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else{
            System.out.println("名字过长，需要(2-6)个字符");
            this.name = "无名";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=120){
            this.age = age;
        }else{
            System.out.println("你设置的年龄不对，默认年龄18");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String info(){
        return "信息为：name="+name+",age="+age+",工作="+job+",薪水="+salary;
    }

}



