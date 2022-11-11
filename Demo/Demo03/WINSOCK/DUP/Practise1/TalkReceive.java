package WINSOCK.DUP.Practise1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    private DatagramSocket server;
    private String from;

    public TalkReceive(int port,String from){
        this.from = from;
        try{
            server = new DatagramSocket(port);
        }catch(SocketException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
        while(true){
            //准备容器。封装成DatagramPacket包裹
            byte[] byt = new byte[1024*60];
            DatagramPacket dp = new DatagramPacket(byt,0,byt.length);
            try{
                //阻塞式接受包裹
                server.receive(dp);
                byte[] datas = dp.getData();
                int len = dp.getLength();
                String data = new String(datas,0,len);
                System.out.println(from+":"+data);
                if(data.equals("bye")){
                    break;
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        //释放资源
        server.close();
    }
}
