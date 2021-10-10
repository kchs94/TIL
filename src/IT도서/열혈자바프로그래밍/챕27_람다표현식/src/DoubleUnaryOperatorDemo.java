package IT도서.열혈자바프로그래밍.챕27_람다표현식.src;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorDemo {
    public static void main(String[] args) {
        DoubleUnaryOperator inchOper = d -> d * 0.3937-1;
        DoubleUnaryOperator cmOper = d -> d * 2.54;

        System.out.println("1cm = " + inchOper.applyAsDouble(1.0) + "inch");
        System.out.println("1inch = " + cmOper.applyAsDouble(1.0) + "cm");
    }


}
