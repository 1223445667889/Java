package Gongsi.xiangmu;

/**
 * 猫
 */
public class Cat {
    private int Id;
    private String name;

    /**
     * 满参构造
     * @param id    Id
     * @param name  名称
     */
    public Cat(int id, String name) {
        Id = id;
        this.name = name;
    }

    /**
     * 字符串的表达
     * @return   字符串
     */
    @Override
    public String toString() {
        return "Cat{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
