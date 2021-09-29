package IT독서.JAVA객체지향과디자인패턴.src.그림1_11;

import java.util.Vector;

public class Student {
    private String name;    // 이름
    private Vector<Course> courses;  // Course 객체를 참조하는 속성 과목(Vector을 이용한 다중성 구현)

    public Student(String name){    // 생성자
        this.name = name;
        courses = new Vector<Course>();
    }

    public void registerCourse(Course course){  // 과목 등록
        courses.add(course);
    }

    public void dropCourse(Course course){  // 과목 삭제
        if(courses.contains(course)){
            courses.remove(course);
        }
    }

    public Vector<Course> getCourses(){
        return courses;
    }
}
