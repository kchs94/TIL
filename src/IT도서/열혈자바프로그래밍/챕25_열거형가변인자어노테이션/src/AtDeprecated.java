package IT도서.열혈자바프로그래밍.챕25_열거형가변인자어노테이션.src;

interface Viewable2{
    @Deprecated
    public void showIt(String str); // Deprecated된 메소드

    public void brShowIt(String str);
}

class Viewer2 implements Viewable2{
    @Override
    public void showIt(String str){
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str){
        System.out.println("[" + str + "]");
    }
}

public class AtDeprecated {
    public static void main(String[] args) {
        Viewable2 view = new Viewer2();
        view.showIt("Hello Annotations123");
        view.brShowIt("Hello Annotations");
    }
}
