package IT도서.열혈자바프로그래밍.챕터32_IO스트림.WriteToFile3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile3 {
    public static void main(String[] args) throws IOException {

        try(OutputStream out = new FileOutputStream("data.dat")) {
            out.write(7);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
