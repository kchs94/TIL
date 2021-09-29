package IT독서.JAVA객체지향과디자인패턴.src.그림1_22;

public class Person {
    private Car owns;   // 이 속성으로 연관관계가 만들어 진다.

    public void setCar(Car owns){
        this.owns = owns;
    }

    public Car getCar(){
        return owns;
    }

}
