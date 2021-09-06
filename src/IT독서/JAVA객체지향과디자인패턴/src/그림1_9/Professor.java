package IT독서.JAVA객체지향과디자인패턴.src.그림1_9;

public class Professor {
    private Student student;

    public void setStudent(Student student){
        this.student = student;
        student.setAdvisor(this);
    }

    public void advise(){
        student.advise("상담 내용은 여기에... ");
    }
}
