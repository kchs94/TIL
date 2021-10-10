package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.문제27_3;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<String, Integer> convert = (s, i) -> {
            if(s == "Robot"){
                if(3 < s.length())
                    return true;
                else
                    return false;
            } else {
                if(5 < s.length())
                    return true;
                else
                    return false;
            }
        };
        
        // test 호출 결과 문자열 "Robot"의 길이가 3을 넘으면 true 반환
        if(convert.test("Robot", 3))
            System.out.println("문자열 길이 3 초과");
        else
            System.out.println("문자열 길이 3 이하");

        if(convert.test("Box", 5))
            System.out.println("문자열 길이 5 초과");
        else
            System.out.println("문자열 길이 5 이하");

    }
}
