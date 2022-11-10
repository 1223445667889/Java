package WINSOCK;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * 网络编程  InetAddress
 *         IntetSocketAddress
 */
public class InetAddress1 {
    public static void main(String[] args)throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.com");

        String name = address.getHostName();
        String ip = address.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("IP地址："+ip);


        //包含端口
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress socketAddress1 = new InetSocketAddress("localhost",9000);
        System.out.println(socketAddress.getHostName());//获取主机名
        System.out.println(socketAddress.getAddress());//获取地址
        System.out.println(socketAddress1.getHostName());
        System.out.println(socketAddress.getPort());//获取端口号
        System.out.println(socketAddress1.getAddress());

    }
}

