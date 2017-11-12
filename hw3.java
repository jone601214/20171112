import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 1, c = 0;
        while (true) {
            int b =scn.nextInt();
            while (a <= b) {
                if (b % a == 0) {
                    c = c + 1;
                }
                a = a + 1;
            }
            if (c == 2) {
                System.out.println("質數");
            } else {
                System.out.println("非質數");
            }
        }
    }
}

