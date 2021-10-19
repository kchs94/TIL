package IT도서.열혈자바프로그래밍.챕터32_IO스트림.Write7ToFile2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2 {
    public static void main(String[] args) throws IOException {

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("data.dat");
            outputStream.write(7);
        }
        finally {
            if(outputStream != null)    // 출력 스트림이 생성에 성공했다면
                outputStream.close();
        }
    }
}
