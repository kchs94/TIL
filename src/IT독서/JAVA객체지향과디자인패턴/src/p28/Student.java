package IT독서.JAVA객체지향과디자인패턴.src.p28;
import java.util.Vector;

public class Student {
    private String name;
    private Vector<Course> courses;

    public Student(String name){
        this.name = name;
        courses = new Vector<Course>();
    }
    public void registerCourse(Course course){
        courses.add(course);
    }

    public void dropCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
        }
    }

    public Vector<Course> getCourses(){
        return courses;
    }
}

class Course{
    private String name;

    public Course(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
