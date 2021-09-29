package IT독서.열혈자바프로그래밍.챕27_람다표현식.src.ObjIntConsumerDemo;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerDemo {
    public static void main(String[] args) {
        ObjIntConsumer<String> c = (s, i) -> System.out.println(i + ". " + s);

        int n = 1;
        c.accept("Toy", n++);
        c.accept("Book", n++);
        c.accept("Candy", n);
    }
}
