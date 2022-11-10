package WINSOCK.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP Socket:  该类实现客户端套接字，套接字是两台机器之间通讯的端点
 *               Socket(InetAddress address, int port)	创建流套接字并将其连接到指定IP地址的指定端口号
 *               Socket(String host, int port)	创建流套接字并将其连接到指定主机上的指定端口号
 *               OutputStream getOutputStream()	返回此套接字的输出流
 *               InputStream getInputStream()	返回此套接字的输入流
 *               void shutdownOutput()	禁用此套接字的输出流
 *
 */
public class SendSocket1 {
    public static void main(String[] args)throws IOException {
        //创建客户端的Socket对象
        //Socket(InetAddress address,int port);创建流套接字并将其连接到指定IP地址的指定端口号
        //Socket s = new Socket(InetAddree.getByName("127.0.0.1"),10005);
        //Socket(String host,int port):创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s = new Socket("127.0.0.1",10005);

        //获取输出流，写数据
        //OutputString getOutStream();返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("Java YYDS!".getBytes());

        //释放资源
        s.close();
    }
}
