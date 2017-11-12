import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入十個數");
        int max=0,min=0;
        for(int i=0;i<10;i++){
            int a=scn.nextInt();
            max=i==0?a:(a>max?a:max);
            min=i==0?a:(a<min?a:min);
        }
        System.out.format("最大值:%d, 最小值:%d",max,min);
    }
}



