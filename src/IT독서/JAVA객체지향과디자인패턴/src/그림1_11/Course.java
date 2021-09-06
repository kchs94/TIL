package IT독서.JAVA객체지향과디자인패턴.src.그림1_11;

public class Course {
    private String name;    // 코스 이름
    // Studnet --> Course로 향하는 단방향 연관 관계이므로 Course 클래스 안에는 Student 속성이 없다.

    public Course(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
