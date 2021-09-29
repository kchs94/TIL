package IT독서.JAVA객체지향과디자인패턴.src.그림1_12;

import java.util.Vector;

public class Course {
    private String name;
    private Vector<Student> students;

    public Course(String name){
        this.name = name;
        students = new Vector<>();
    }

    // 학생 등록하기
    public void addStudent(Student student){
        students.add(student);
    }

    // 학생 해제하기
    public void removeStudent(Student student){
        students.remove(student);
    }

    // 학생 조회하기
    public Vector<Student> getStudents(){
        return students;
    }

    // 수업 이름 조회하기
    public String getName(){
        return name;
    }

}
