package IT도서.열혈자바프로그래밍.챕터32_IO스트림.ObjectInput;

import IT도서.열혈자바프로그래밍.챕터32_IO스트림.ObjectOutput.SBox;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
* 객체 역 직렬화를 통해 외부 바이너리 파일에 저장되어있는 인스턴스를 프로그램 안으로 가져오는 문제.
* */
public class ObjectInput {
    public static void main(String[] args) {
        try (ObjectInputStream oi =
                new ObjectInputStream(new FileInputStream("Object.bin"))){
            SBox box1 = (SBox)oi.readObject();
            System.out.println(box1.get());
            SBox box2 = (SBox)oi.readObject();
            System.out.println(box2.get());

        } catch(ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}
