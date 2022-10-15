package Gongsi.xiangmu;

import java.util.Objects;

public class Dog1 {
    private String name;
    private String strain;

    public Dog1() {
    }

    public Dog1(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Dog1{" +
                "name='" + name + '\'' +
                ", strain='" + strain + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog1 dog1 = (Dog1) o;
        return name.equals(dog1.name) &&
                strain.equals(dog1.strain);
    }

}
