package Reflection;

import java.util.concurrent.SynchronousQueue;

public class Reflection1 {
    public static void main(String[] args) throws Exception {
       Class<?> class1 = Class.forName("Reflection.Person");

       System.out.println("属性名："+class1.getCanonicalName());
    }
}

