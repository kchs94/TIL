package IT독서.JAVA객체지향과디자인패턴.src.그림1_14;

import java.util.Iterator;
import java.util.Vector;

public class Student {
    private String name;    // 학생 이름
    private Vector<Transcript> transcripts; // 성적 목록

    public Student(String name){
        this.name = name;
        transcripts = new Vector<>();
    }
    
    // 성적 등록
    public void addTranscript(Transcript transcript){
        transcripts.add(transcript);
    }

    // 수강한 모든 과목 구하기
    public Vector<Course> getCourse(){
        Vector<Course> courses = new Vector<>();
        Iterator<Transcript> itor = transcripts.iterator();

        while(itor.hasNext()){
            Transcript tr = itor.next();
            courses.add(tr.getCourse());
        }
        return courses;
    }
}
