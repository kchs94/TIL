package IT도서.JAVA객체지향과디자인패턴.src.챕터2.코드2_17;

abstract class Pet{
    public abstract void talk();
}

class Cat extends Pet{
    @Override
    public void talk(){
        System.out.println("냐옹~");
    }
}

class Dog extends Pet{
    @Override
    public void talk(){
        System.out.println("멍멍~");
    }
}

public class Main {

    public static void groupTalk(Pet[] pets){
        for(int i=0; i<pets.length; i++){
            pets[i].talk();
        }
    }

    public static void main(String[] args) {
        Pet[] pets = { new Cat(), new Dog()};
        groupTalk(pets);
    }
}
