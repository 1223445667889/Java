package WINSOCK.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP ServerSocket:  该类实现了服务器套接字，服务器套接字等待通过网络进入的请求
 *  *                 ServerSocket(int port)	创建绑定到指定端口的服务器套接字
 *  *                 Socket accept()	侦听要连接到此套接字并接受它
 */
public class ServerSocket1 {
    public static void main(String[] arg)throws IOException {
        //创建服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10005);

        //Socket accept();侦听要连接到此套接字并接受它
        Socket s = ss.accept();

        //获取输入流，读取数据，并把数据显示在控制台上
        InputStream is = s.getInputStream();
        byte[] byt = new byte[1024];
        int len = is.read(byt);
        String data = new String(byt,0,len);
        System.out.println("数据是："+data);

        //释放资源
        ss.close();
    }
}
