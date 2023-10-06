package JavaProgramming.Ch10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
    public static void read (String path) {
        // 읽기 객체 선언
        BufferedReader br = null;

        // 예외 처리를 위한 try 구간 정의
        try {

            //읽기 절차 1 : 읽기 객체 생성
            br = new BufferedReader(new FileReader(path));

            //읽기 절차 2 : 파일 읽기
            while (true) {
                String readLine = br.readLine();
                if(readLine == null) {
                    break;
                }
                System.out.println(readLine);
            }
        }
        // 예외 처리를 위한 catch 구간 정의
        catch (FileNotFoundException e) {
            // 해당 파일 경로에 파일이 없는 경우에 에러 처리 구간
            e.printStackTrace();
        } catch (IOException e) {
            //스트림을 이용하여 읽기 / 쓰기 작업 시 발생하는 에러 처리 구간
            //e.printStackTrace : 에러 발생 시 에러에 대한 정보를 콘솔에 나타내는 함수
            // 실제 운영 프로그램에서는 사용 지양.
            e.printStackTrace();
        }
        // 예외 처리를 위한 finally 구간 정의
        finally {
            // 읽기 절차 3 : 파일 읽기 종료
            try {
                if(br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Read File
        String path = "JavaProgramming/Ch10/FileRead2.java";
        FileRead2 fr = new FileRead2();
        fr.read(path);
    }
}