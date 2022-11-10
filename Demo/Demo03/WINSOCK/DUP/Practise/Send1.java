package WINSOCK.DUP.Practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP发送数据：2
 *           数据来自键盘录入，输入888，发送结束
 */
public class Send1 {
    public static void main(String[] args)throws IOException {
        //创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            if("888".equals(line)){
                break;
            }

            //创建数据，大数据打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"),12345);
            ds.send(dp);
            ds.close();
        }
    }
}
