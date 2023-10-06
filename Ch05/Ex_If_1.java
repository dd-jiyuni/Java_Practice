package JavaProgramming.Ch05;

public class Ex_If_1 {
    public static void main(String[] args) {
        int a = 10;

        if (a % 7 ==1) {
            System.out.println("a["+a+"]는 7로 나눌 때 나머지가 1인 수");
        }
        else if (a % 7 == 2 || a % 7 == 3) {
            System.out.println("a["+a+"]는 7로 나눌 때 나머지가 2 or 3 인 수");
        }
        else if (a % 7 == 4 || a % 7 == 5) {
            System.out.println("a["+a+"]는 7로 나눌 때 나머지가 4 or 5 인 수");
        }
        else if (a % 7 == 6) {
            System.out.println("a["+a+"]는 7로 나눌 때 나머지가 6 인 수");
        }
        else {
            System.out.println("a["+a+"]는 7로 나눌 때 나머지가 0 인 수");
        }
    }
}
