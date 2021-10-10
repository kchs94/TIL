package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.PredicateDemo;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static int sum(Predicate<Integer> predicate, List<Integer> list){
        int sum = 0;
        for(int n : list){
            if(predicate.test(n))
                sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
        int sum;

        sum = sum(n -> n%2 == 0, list);
        System.out.println("짝수 합: " + sum);

        sum = sum(n -> n%2 != 0, list);
        System.out.println("홀수 합: " + sum);
    }
}
