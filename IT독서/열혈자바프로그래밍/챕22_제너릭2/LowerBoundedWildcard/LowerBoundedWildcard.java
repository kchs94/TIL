package IT독서.열혈자바프로그래밍.챕22_제너릭2.LowerBoundedWildcard;

class Box<T>{
    private T ob;
    public void set(T o ){ ob = o;}
    public T get(){ return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

class Unboxer {
    public static void peekBox(Box<? super Number> box){
        System.out.println(box);
    }
}

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>();
        iBox.set(5577);

        Box<Number> nBox = new Box<Number>();
        nBox.set(9955);

        Box<Object> oBox = new Box<Object>();
        oBox.set("My Simple Instance");

        Unboxer.peekBox(nBox);
        Unboxer.peekBox(oBox);
    }
}
