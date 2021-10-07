package IT도서.JAVA객체지향과디자인패턴.src.챕터2.회사운전사종업원;

class Person{
    private Role role;

    public void setRole(Role role){
        this.role = role;
    }

    public Role getRole(){
        return role;
    }

    public void doIt(){
        role.doIt();
    }
}

abstract class Role{
    public abstract void doIt();
}

class Driver extends Role{
    @Override
    public void doIt(){
        System.out.println("운전하기");
    }
}

class Worker extends Role{
    @Override
    public void doIt(){
        System.out.println("일하기");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setRole(new Driver());
        person.doIt();

        person.setRole(new Worker());
        person.doIt();
    }


}
