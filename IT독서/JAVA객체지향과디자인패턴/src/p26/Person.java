package IT독서.JAVA객체지향과디자인패턴.src.p26;

class Phone{

}

public class Person {
    private Phone[] phones;

    public Person(){
        phones = new Phone[2];
    }

    public Phone getPhone(int i){
        if(i == 0 || i == 1)
            return phones[i];   // i = 0이면 집 전화, i = 1이면 사무실 전화
        return null;
    }
}
