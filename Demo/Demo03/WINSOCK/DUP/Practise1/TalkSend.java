package WINSOCK.DUP.Practise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    private DatagramSocket client;//DatagramSocket()构建一个数据报套接字 ，绑定到本地主机的任何可用的端口
    private BufferedReader reader;//BufferedReader 缓冲区读取内容，避免中文乱码
    private String ToIP;//对方的IP地址
    private int ToPort;//对方的端口

    public TalkSend(int port,String ToIP, int toPort) {
        this.ToIP = ToIP;
        this.ToPort = toPort;
        try{
            client = new DatagramSocket(port);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch(SocketException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        while(true){
            String data;
            try{
                data = reader.readLine();
                byte[] datas = data.getBytes();
                //封装成DatagramPacket包裹，指定目的地
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.ToIP,this.ToPort));
                client.send(packet);
                //终止条件
                if(data.equals("bye")){
                    break;
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        //释放资源
        client.close();
    }
}












