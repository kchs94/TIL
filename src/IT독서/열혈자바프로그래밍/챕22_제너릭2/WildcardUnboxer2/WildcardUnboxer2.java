package IT독서.열혈자바프로그래밍.챕22_제너릭2.WildcardUnboxer2;

class Box<T>{
    private T ob;
    public void set(T o ){ ob = o;}
    public T get(){ return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

class Unboxer{
    public static <T> T openBox(Box<T> box){
        return box.get();
    }
    public static void peekBox(Box<?> box){
        System.out.println(box);
    }
}

public class WildcardUnboxer2 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("So Simple String");
        Unboxer.peekBox(box);
    }
}
