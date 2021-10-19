package IT도서.열혈자바프로그래밍.챕터32_IO스트림.Write7ToFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream =
                new FileOutputStream("data.dat" );  // 1.출력 스트림 생성
        outputStream.write(7);   // 2.데이터 7 저장하기
        outputStream.close();    //3. 스트림 종료하기 
    }
}
