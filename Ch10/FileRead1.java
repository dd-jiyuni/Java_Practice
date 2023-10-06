package JavaProgramming.Ch10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {
    public static void read(String path) throws FileNotFoundException, IOException {


        // 읽기 절차 1 : 읽기 객체 생성
        BufferedReader br = new BufferedReader(new FileReader(path));

        // 읽기 절차 2 : 파일 읽기
        while (true) {
            String readLine = br.readLine();
            if(readLine == null) {
                break;
            }
            System.out.println(readLine);
        }

        // 읽기 절차 3 : 파일 읽기 종료
        br.close();
    }

    // fr.read()에서 예외 선언된 부부의 예외처리를 위해 main()함수 예외선언
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // 파일 경로 설정 후 파일 읽기
        String path = "JavaProgramming/Ch10/FileRead1.java";
        FileRead1 fr = new FileRead1();
        fr.read(path);
    }
}
