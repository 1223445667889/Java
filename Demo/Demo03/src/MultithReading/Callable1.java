package MultithReading;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.*;

/**
 * 多线程中的Callable接口
 * 实现Callable接口，需要返回值类型
 * 重写call方法，需要抛出异常
 * 创建目标对象
 * 创建执行服务：ExecutorService ser = Executors.newFixedThreadPool(1);
 * 提交执行：Future result1 = ser.submit(t1);
 * 获取结果：boolean r1 = result1.get()
 * 关闭服务：ser.shutdownNow();
 */

//模板
//多线程的图片下载
//实现图片的下载要导入common-io的jar包
public class Callable1 {
    public static void main(String[] args){
        downThread t1 = new downThread("https://...","a.jpg");
        downThread t2 = new downThread("https://...","b.jpg");

        //创建执行的服务，开启线程池
        ExecutorService ser = Executors.newFixedThreadPool(2);

        //提交执行
        Future<Boolean> future1 = ser.submit(t1);
        Future<Boolean> future2 = ser.submit(t2);

        //获取结果
//        boolean flag1 = future1.get();
//        boolean flag2 = future2.get();
//        System.out.println(flag1);
//        System.out.println(flag2);
    }
}

class downThread implements Callable<Boolean>{
    public String url;
    public String name;

    public downThread(String ur1, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call(){
        webDownLoad webDownLoad = new webDownLoad();
        webDownLoad.photoDown(url,name);
        System.out.println(name+"图片下载文成");
        return true;
    }
}

class webDownLoad{
    //定义下载图片的方法
    public void photoDown(String ur1,String name){
        //借助封装的类，FileUtils 将该路径的图片拷贝到指定文件
        String file = "D:\\....";//文件目录
//        try{
            //将网络路径 url 的资源下载到指定的文件夹中去，并命名为name
//            FileUtils.copyURLToFile(new URL(url),new File(file,name));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}





















