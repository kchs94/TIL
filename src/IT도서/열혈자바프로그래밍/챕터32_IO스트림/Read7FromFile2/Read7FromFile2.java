package IT도서.열혈자바프로그래밍.챕터32_IO스트림.Read7FromFile2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {
    public static void main(String[] args) throws IOException {

        InputStream in = null;

        try {
            in = new FileInputStream("data.dat");
        }
        finally {
            if(in != null)  // 입력 스트림 생성에 성공했다면,
                in.close();
        }
    }
}
