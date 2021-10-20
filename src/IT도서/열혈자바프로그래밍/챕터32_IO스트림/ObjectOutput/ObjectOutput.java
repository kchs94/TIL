package IT도서.열혈자바프로그래밍.챕터32_IO스트림.ObjectOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
    public static void main(String[] args) {
        SBox box1 = new SBox("로봇");
        SBox box2 = new SBox("스트로베리");

        try (ObjectOutputStream oo =
                new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
            oo.writeObject(box1);   // box1이 참조하는 인스턴스 저장
            oo.writeObject(box2);   // box1이 가리키는 인스턴스 저장
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
