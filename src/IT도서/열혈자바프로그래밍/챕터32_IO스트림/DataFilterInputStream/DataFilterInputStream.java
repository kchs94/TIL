package IT도서.열혈자바프로그래밍.챕터32_IO스트림.DataFilterInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFilterInputStream {
    public static void main(String[] args) {
        try (DataInputStream in =
                new DataInputStream(new FileInputStream("data.dat"))){
            int num1 = in.readInt();     // int 형 데이터 꺼냄
            double num2 = in.readDouble();  //double형 데이터 꺼냄

            System.out.println(num1);
            System.out.println(num2);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
