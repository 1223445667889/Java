package Project.shili;

public class Java4 {
    public static void main (String[] args) {
        int x = 5;
        Integer x1 = x;
        Integer x2 = x;
        int x3 = new Integer(5);
        System.out.print(x1.equals(x));
        System.out.print(x1 == x);
        System.out.print(x2.equals(x1));
        System.out.print(x2 == x1);
        System.out.print(x2 == x3);
        System.out.print(x2.equals(x3));
        boolean c = false;
        float f = 23.423f;

        int sum =0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                sum = i*j;
                System.out.print(i+"*"+j+"="+sum+"\t");
            }
            System.out.println();
        }


        int[] arr = {12,4,22,11,24,9};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int fb =0;
                    fb = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = fb;
                }
            }
        }
        System.out.println("最大值为："+arr[arr.length-1]);
        System.out.println("最小值为："+arr[0]);


    }

}
