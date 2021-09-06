package IT독서.JAVA객체지향과디자인패턴.src.그림1_9;

public class Student {
    private Professor professor;

    public void setAdvisor(Professor advisor){
        this.professor = advisor;
    }

    public void advise(String msg){
        System.out.println(msg);
    }
}
