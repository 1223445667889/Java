package Text;

import Gongsi.xiangmu.Dayinji.*;

public class Java1 {
    public static void main(String[] args){
        //买个裸机
        //Printer printer =new Printer();
        //System.out.println(printer);


        //买个整机
        Printer printer  = new Printer(new Color(),new A4paper());
        System.out.println(printer);

        //跟换纸张
        printer.setInk(new Blank());
        printer.setPaper(new B5paper());
        System.out.println(printer);
    }
}
