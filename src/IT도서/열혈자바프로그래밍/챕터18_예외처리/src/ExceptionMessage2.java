package IT도서.열혈자바프로그래밍.챕터18_예외처리.src;

public class ExceptionMessage2 {
    public static void main(String[] args){
        try {
            md1(3);
        }
        catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("Good bye~~");
    }

    public static void md1(int n){
        md2(n, 0);      // 아래 메소드 호출
    }

    public static void md2(int n1, int n2){
        int r = n1 / n2;    // 예외 발생 지점x
    }
}
