package IT독서.JAVA객체지향과디자인패턴.src.그림1_14;

import java.util.Vector;

public class Course {   // 과목
    private String name;    // 과목 이름
    private Vector<Transcript> transcripts; // 과목 성적

    public Course(String name){
        this.name = name;
        transcripts = new Vector<>();
    }

    // 성적 등록
    public void addTranscript(Transcript transcript){
        transcripts.add(transcript);
    }

    // 과목 이름 조회
    public String getName(){
        return name;
    }
    
}
