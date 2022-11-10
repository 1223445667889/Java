package WINSOCK;

import java.net.MalformedURLException;
import java.net.URL;

public class URL1 {
    public static void main(String[] args)throws MalformedURLException {
        URL url = new URL("http://www.baidu.com:80/index.html?uname=dream&age=18#a");
        System.out.println("协议："+url.getProtocol());
        System.out.println("域名|IP："+url.getHost());
        System.out.println("端口："+url.getHost());
        System.out.println("请求资源1："+url.getPath());
        System.out.println("请求资源2："+url.getFile());
        //参数
        System.out.println("参数："+url.getQuery());
        System.out.println("锚点："+url.getRef());
    }
}
