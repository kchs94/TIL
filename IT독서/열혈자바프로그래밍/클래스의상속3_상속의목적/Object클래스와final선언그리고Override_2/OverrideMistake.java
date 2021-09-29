package IT독서.열혈자바프로그래밍.클래스의상속3_상속의목적.Object클래스와final선언그리고Override_2;

class ParentAdder{
    public int add(int a, int b){
        return a+b;
    }
}

class ChildAdder extends ParentAdder {
    @Override
    public int add(int a, int b){
        System.out.println("덧셈을 진행합니다.");
        return a+b;
    }
}

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3, 4));
    }
}
