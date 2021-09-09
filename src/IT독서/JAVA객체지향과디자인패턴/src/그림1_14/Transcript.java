package IT독서.JAVA객체지향과디자인패턴.src.그림1_14;

// 성적
public class Transcript {
    private Student student;    // 학생 이름
    private Course course;      // 과목 이름
    private String date;        // 날짜
    private String grade;       // 학점

    public Transcript(Student student, Course course){
        this.student = student;
        this.student.addTranscript(this);
        this.course = course;
        this.course.addTranscript(this);
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }
}
