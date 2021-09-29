package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;
/*
* 열거형이란 자료형의 일종입니다. 자바 5에서 추가된 내용인데요. '상수' 선언과 관련하여 탄생하였습니다.
* 열거형이 나오전에는 하나의 인터페이스 내에 변수를 선언하여 연관된 상수를 표현하였습니다. 참고로 인터페이스 안의 변수는 public, static,
* final이 선언된 것으로 간주합니다.
* 하지만 이 방식에는 문제가 있습니다.
*
* */

// 상수를 선언하기 위한 인터페이스
interface Scale {
    int Do = 0; int RE = 1; int MI = 2; int FA = 3;
    int SO = 4; int RA = 5; int TI = 6;
}

public class InterfaceBaseConst {
    public static void main(String[] args) {
        int sc = Scale.Do;

        switch(sc){
            case Scale.Do:
                System.out.println("도~ ");
                break;
            case Scale.RE:
                System.out.println("레~ ");
                break;
            case Scale.MI:
                System.out.println("미~ ");
                break;
            case Scale.FA:
                System.out.println("파~ ");
                break;
            default:
                System.out.println("솔~ 라~ 시~");
        }
    }
}
