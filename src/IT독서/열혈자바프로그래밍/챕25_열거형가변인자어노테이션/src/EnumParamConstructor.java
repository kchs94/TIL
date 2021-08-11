package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

enum Person3{
    MAN(29), WOMAN(25);

    int age;
    private Person3(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "저는 " + age + "살 입니다.";
    }
}

public class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person3.MAN);
        System.out.println(Person3.WOMAN);
    }
}
