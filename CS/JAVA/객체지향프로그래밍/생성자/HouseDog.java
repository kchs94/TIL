package JAVA.객체지향프로그래밍.생성자;

public class HouseDog extends Dog{  // HouseDog 클래스는 Dog 클래스를 상속받는다.
    public HouseDog(String name){   // 생성자
        this.setName(name);
    }
    public void sleep(){    // 메소드 오버라이딩
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour){    // 메소드 오버로딩
        System.out.println(this.name + "zzz in house " + hour + " hours");
    }
}
