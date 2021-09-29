package JAVA.입출력.콘솔입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream; // 자바 내장 클래스 내장 클래스이지만 java.lang 패키지에 속해있지 않은 클래스는 import 해야한다.
                            // String이나 System 클래스는 java.lang에 있으서 import할 필요가 없었다.
import java.io.InputStreamReader;
/*
* 콘솔: 사용자의 입력을 받거나 사용자에게 문자열을 출력해주는 역할을 하는 것.
* 콘솔 출력(console output): 프로그램을 실행 할 때 문자열을 보여주는 것.
* 콘솔 입력(console input): 사용자가 입력하는 문자열.
*
* InputStream - byte
* InputStreamReader - character
* BufferedRedaer - String
* */
public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        System.out.println(a);
    }
}
