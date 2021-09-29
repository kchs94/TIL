package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

enum Person3{   // 열거형 Person3
    MAN(13), WOMAN(15);

    int age;

    private Person3(int age){   // 열거형 생성자. 열거형 안에서 객체 생성이 이루어 지므로 private.
        this.age = age;
    }

    @Override
    public String toString(){
        return "I am " + age + " years old";
    }

}

public class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person3.MAN);
        System.out.println(Person3.WOMAN);
    }
}
