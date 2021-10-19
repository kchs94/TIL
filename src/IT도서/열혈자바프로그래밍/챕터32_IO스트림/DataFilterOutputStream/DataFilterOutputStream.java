package IT도서.열혈자바프로그래밍.챕터32_IO스트림.DataFilterOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFilterOutputStream {
    public static void main(String[] args) {
        try(DataOutputStream dataOutputStream =
                new DataOutputStream(new FileOutputStream("data.dat"))) {
            dataOutputStream.writeInt(370); // int형 데이터 저장
            dataOutputStream.writeDouble(3.14); // double형 데이터 저장
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
