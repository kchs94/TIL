package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.StringStream2;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream2 {
    public static void main(String[] args) {
        String[] name = {"KIM", "CHOONG", "SEOP"};
        
       Arrays.stream(name)
               .forEach(s -> System.out.println(s));
    }
}
