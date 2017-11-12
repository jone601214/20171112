import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {//字串相加
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入數字:");
        String input = scn.nextLine();
        int sum = 0;//
        char[] ch_array = input.toCharArray();//將字串轉成字元陣列把變數變成一開始
        for(int i=0;i<ch_array.length;i++){
            int c = ch_array[i]-'0';
            sum+=c;
        }
        System.out.println(sum);
    }
    }

