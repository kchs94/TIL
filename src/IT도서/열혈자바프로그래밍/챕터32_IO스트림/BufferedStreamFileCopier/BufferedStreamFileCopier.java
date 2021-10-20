package IT도서.열혈자바프로그래밍.챕터32_IO스트림.BufferedStreamFileCopier;

import java.io.*;
import java.util.Scanner;

public class BufferedStreamFileCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("대상 파일: ");
        String src = sc.nextLine();

        System.out.print("사본 파일: ");
        String dst = sc.nextLine();

        try(BufferedInputStream in =
                new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream out =
                    new BufferedOutputStream(new FileOutputStream(dst))) {
            int data;
            while(true){
                data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
