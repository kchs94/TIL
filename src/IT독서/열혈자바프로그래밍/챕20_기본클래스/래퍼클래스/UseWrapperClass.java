package IT독서.열혈자바프로그래밍.챕20_기본클래스.래퍼클래스;

public class UseWrapperClass {
    public static void showData(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer iInst = new Integer(3); // 정수 3을 감싸는 래퍼 인스턴스 생성
        showData(iInst);
        showData(new Double(7.15)); // 7.15를 감싸는 래퍼 인스턴스 생성 및 전달
    }

}
