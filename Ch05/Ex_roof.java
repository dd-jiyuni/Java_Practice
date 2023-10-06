package JavaProgramming.Ch05;

public class Ex_roof {
    public static void main(String[] args) {

        // for 문
        int sum1 = 0;

        for(int i = 0; i <= 100; i++) {
            sum1 += i;
        }
        System.out.println("1~100까지 합 "+ sum1);

        // while 문
        int index = 0;
        int sum2 = 0;

        while( index <= 100 ) {
            sum2 += (index++);
        }
        System.out.println("1~100까지 합 "+ sum2);

        //for & if
        int sum3 = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 1) continue;
            sum3 += i;
        }
        System.out.println("1~100까지 합 "+ sum3);

        //while & if
        int index4 = 0;
        int sum4 = 0;

        while(true) {
            sum4 += index4++;

            if(sum4 >= 3000) break;
        }
        String msg = "1부터 1씩 증가하여값을 더할 때 그 합이 최초로 '3000'을 넘기는 정수는 ";
        msg += "["+index4+"] 이며, 합의 값은 ["+ sum4 + "]이다.";
        System.out.println(msg);
    }



}
