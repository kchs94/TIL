package IT독서.JAVA객체지향과디자인패턴.src.그림1_12;

import java.util.Vector;

public class Student {
    private String name;    // 이름
    private Vector<Course> courses; // 다중성을 위해 Vector 사용

    public Student(String name){    // 생성자
        this.name = name;
        courses = new Vector<>();
    }

    // 수업 등록하기
    public void registerCourse(Course course){  
        courses.add(course);
        course.addStudent(this);

    }
    // 수업 삭제하기
    public void dropCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    // 수업 조회하기
    public Vector<Course> getCourses(){
        return courses;
    }
}
