package IT독서.열혈자바프로그래밍.챕21_제네릭1.이_제네릭기본문법.BoxInBox;

class Box<T> {
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

public class BoxInBox {
    public static void main(String[] args) {
        Box<String> sBox = new Box<>();
        sBox.set("행복해");

        Box<Box<String>> wBox = new Box<>();
        wBox.set(sBox);

        Box<Box<Box<String>>> zBox = new Box<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
