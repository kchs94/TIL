package IT도서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;
// 열거형은 클래스 안에서도 정의가 가능합니다.

class Customer{
    enum Gender{    // 클래스 안에서 정의된 열거형
        MALE, FEMALE
    }

    private String name;
    private Gender gen; // 참조변수

    Customer(String n, String g){
        name = n;

        if(g.equals("man"))
            gen = Gender.MALE;
        else
            gen = Gender.FEMALE;
    }

    @Override
    public String toString(){
        if(gen == Gender.MALE)
            return "Thank you, Mr " + name;
        else
            return "Thnak you, Ms " + name;
    }
}

public class InnerEnum {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Brown", "man");
        Customer cus2 = new Customer("Susan Hill", "woman");

        System.out.println(cus1);
        System.out.println(cus2);
    }
}
