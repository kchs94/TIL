package IT도서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

enum Scale2{    // 열거형 Scale2 정의
    DO, RE, MI, FA, SO, RA, TI  // 열거형 값
}


public class SimpleEnum {
    public static void main(String[] args) {
        Scale2 sc = Scale2.DO;  // 기본적인 열거형값 표현, sc는 참조변수
        System.out.println(sc);


        switch(sc){
            case DO:
                System.out.println("도~ ");
                break;
            case RE:
                System.out.println("레~ ");
                break;
            case MI:
                System.out.println("미~ ");
                break;
            case FA:
                System.out.println("파~ ");
                break;
            default:
                System.out.println("솔~ 라~ 시~ ");
        }
    }
}
