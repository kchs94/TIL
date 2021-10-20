package IT도서.열혈자바프로그래밍.챕터32_IO스트림.TextWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextWriter {
    public static void main(String[] args) {
        try(Writer out = new FileWriter("data.txt")) {
            for(int ch = (int)'A'; ch<(int)('Z'+1); ch++)
                out.write(ch);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
