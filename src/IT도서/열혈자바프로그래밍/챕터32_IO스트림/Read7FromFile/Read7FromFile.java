package IT도서.열혈자바프로그래밍.챕터32_IO스트림.Read7FromFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("data.dat");  // 1.입력 스트림 만들기
        int dat = inputStream.read();   // 2. 데이터 읽기
        inputStream.close();

        System.out.println(dat);

    }
}
