package IT독서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;


interface Viewable3{
    @Deprecated
    public void showIt(String str); // Deprecated된 메소드

    public void brShowIt(String str);
}

class Viewer3 implements Viewable3{
    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str){
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str){
        System.out.println("[" + str + "]");
    }
}
public class AtSuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Viewable3 view = new Viewer3();
        view.showIt("Hello Annotations123");
        view.brShowIt("Hello Annotations");
    }
}
