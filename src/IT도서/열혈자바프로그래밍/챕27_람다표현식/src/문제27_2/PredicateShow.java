package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.문제27_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateShow {

    public static <T> void show(Predicate<T> predicate, List<T> list){

        for(T e : list){

            if(predicate.test(e))
                System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 8, 10, 11);
        show(n -> n%2 != 0, list1);

        List<Double> list2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
        show(n -> 0.0 < n, list2);
    }
}
