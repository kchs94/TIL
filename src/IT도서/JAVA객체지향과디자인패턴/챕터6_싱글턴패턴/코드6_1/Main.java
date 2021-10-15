package IT도서.JAVA객체지향과디자인패턴.챕터6_싱글턴패턴.코드6_1;


class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public void print(){
        Printer printer = Printer.getPrinter();
        printer.print(this.name + " print using " + printer.toString() + ".");
    }
}

class Printer {
    private static Printer printer = null;

    private Printer() { }

    public static Printer getPrinter() {
        if(printer == null)
            printer = new Printer();    // Printer 인스턴스 생성

        return printer;
    }

    public void print(String str){
        System.out.println(str);
    }
}

public class Main {

    private static final int USER_NUM = 5;

    public static void main(String[] args) {
        User[] users = new User[USER_NUM];

        for(int i=0; i<USER_NUM; i++) {
            users[i] = new User((i+1) + "-user");   // User 인스턴스 생성
            users[i].print();
        }
    }
}
