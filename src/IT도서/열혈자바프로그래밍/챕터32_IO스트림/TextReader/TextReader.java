package IT도서.열혈자바프로그래밍.챕터32_IO스트림.TextReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("읽을 파일: ");
        String src = sc.nextLine();

        try(Reader in = new FileReader(src)) {
            int ch;

            while(true) {
                ch = in.read(); // 문자를 하나씩 읽는다.
                if(ch == -1)
                    break;
                System.out.print((char)ch);   // 문자를 하나씩 출력한다.
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
