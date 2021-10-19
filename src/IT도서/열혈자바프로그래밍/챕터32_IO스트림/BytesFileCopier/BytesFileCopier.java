package IT도서.열혈자바프로그래밍.챕터32_IO스트림.BytesFileCopier;

import java.io.*;
import java.util.Scanner;

public class BytesFileCopier {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("대상 파일: ");
        String sourceFile = in.nextLine();

        System.out.print("사본 파일: ");
        String copyFile = in.nextLine();

        try(InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(copyFile)) {
            int data;
            while(true){
                data = inputStream.read();
                if(data ==-1)
                    break;
                outputStream.write(data);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
