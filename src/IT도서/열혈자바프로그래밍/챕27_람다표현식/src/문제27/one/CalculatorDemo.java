package IT도서.열혈자바프로그래밍.챕27_람다표현식.src.문제27.one;

interface Calculate<T>{
    T cal(T a, T b);
}

public class CalculatorDemo {
    public static <T> void calAndShow(Calculate<T> op, T n1, T n2){
        T r = op.cal(n1, n2);
        System.out.println(r);
    }

    public static void main(String[] args) {
        CalculatorDemo.calAndShow((a, b) -> a+b, 3, 4);
        CalculatorDemo.calAndShow((a, b) -> a+b, 2.5, 7.1);
        CalculatorDemo.calAndShow((a, b) -> a-b, 4, 2);
        CalculatorDemo.calAndShow((a, b) -> a-b, 4.9, 32.);
    }
}
