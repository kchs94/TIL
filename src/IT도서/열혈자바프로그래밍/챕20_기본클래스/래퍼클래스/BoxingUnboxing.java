package IT도서.열혈자바프로그래밍.챕20_기본클래스.래퍼클래스;

/*
* 래퍼 클래스의 기능
* 1. 값을 인스턴스로 감싸기
* 2. 인스턴스에서 값을 꺼내기
*
* */
public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer iObj = new Integer(10); // 박싱 int  --> Integer
        Double dObj = new Double(3.14); // 박싱 double --> Double
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj.intValue(); // 언박싱 Integer --> int
        double num2 = dObj.doubleValue();   // 언박싱 Double --> double
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        // 래퍼 인스턴스 값의 증가 방법
        iObj = new Integer(iObj.intValue() + 10);
        dObj = new Double(dObj.intValue() + 1.2);
        System.out.println(iObj);
        System.out.println(dObj);
    }
}
