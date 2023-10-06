package JavaProgramming.Ch03;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 후 마지막에 -1을 입력하셈.");

        int n = sc.nextInt();
        while (n != -1) {
            sum += n;
            count++;
            n = sc.nextInt();
        }
        if(count==0) {
            System.out.println("입력된 수 없음");
        }
        else {
            System.out.print("정수의 개수는 " + count +" 개이며, ");
            System.out.println("평균은 " + (double)sum/count + " 입니다.");
        }
        sc.close();
    }
}
