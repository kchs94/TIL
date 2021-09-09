package IT독서.JAVA객체지향과디자인패턴.src.그림1_9;

public class Main {
    public static void main(String[] args) {
        Professor hongGilDong = new Professor();
        Student manSup = new Student();

        hongGilDong.setStudent(manSup);
        hongGilDong.advise();
    }
}
