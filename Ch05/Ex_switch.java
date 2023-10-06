package JavaProgramming.Ch05;

public class Ex_switch {
    public static void main(String[] args) {
        int a = 10;

        switch (a % 7) {
            case 1 :
                System.out.println("a["+a+"]는 7로 나눌 때 나머지가 1인 수");
                break;
            case 2 :
            case 3 :
                System.out.println("a["+a+"]는 7로 나눌 때 나머지가 2 or 3 인 수");
                break;
            case 4 :
            case 5 :
                System.out.println("a["+a+"]는 7로 나눌 때 나머지가 4 or 5 인 수");
                break;
            case 6 :
                System.out.println("a["+a+"]는 7로 나눌 때 나머지가 6 인 수");
                break;

            default:
                System.out.println("a["+a+"]는 7로 나눌 때 나머지가 0 인 수");
        }
    }
}
