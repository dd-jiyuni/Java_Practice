package JavaProgramming.Ch05;

import java.util.Scanner;

//구구단
public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= 9; i++) {
            result = i * a;
            System.out.println(a +" * " + i + " = " + result);
        }
    }
}
