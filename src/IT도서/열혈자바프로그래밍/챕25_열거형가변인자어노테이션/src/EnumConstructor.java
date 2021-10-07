package IT도서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

enum Person2{
    MAN, WOMAN;

    private Person2(){
        System.out.println("Person 생성자가 호출되었습니다!!");
    }
    @Override
    public String toString(){
        return "나는 dog 사람입니다.";
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person2.MAN);
        System.out.println(Person2.WOMAN);
    }
}
