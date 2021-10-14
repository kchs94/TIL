package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.ReduceStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Simple", "Complex", "Robot");

        BinaryOperator<String> binaryOperator = (s1, s2) ->{
            if(s1.length() > s2.length())
                return s1;
            else
                return s2;
        };

        String str =  list.stream()
                            .reduce("", binaryOperator);
        System.out.println(str);
    }
}
