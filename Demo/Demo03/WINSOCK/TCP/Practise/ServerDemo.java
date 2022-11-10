package WINSOCK.TCP.Practise;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args)throws IOException {
        //创建服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10005);

        //Socket accept();侦听要连接到此套接字并接受它
        Socket s = ss.accept();

        //获取输入流，读取数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] byt = new byte[1024];
        int len = is.read(byt);
        String data = new String(byt,0,len);
        System.out.println("服务器："+data);

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到：".getBytes());

        //释放资源
        ss.close();
    }
}
