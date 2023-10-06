package JavaProgramming.Ch03;

// for문을 이용해서 1~10까지 덧셈으로 표시하고 합을 출력해라
public class Ex3_1 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i <= 10; i++) {
            sum += i;

            System.out.print(i);

            if(i <= 9 )
                System.out.print(" + ");

            else {
                System.out.print(" = " + sum);
            }
        }
    }

}
