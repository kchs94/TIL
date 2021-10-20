package IT도서.열혈자바프로그래밍.챕터32_IO스트림.ObjectOutput;


public class SBox implements java.io.Serializable {
    String s;
    public SBox(String s){
        this.s = s;
    }
    public String get(){
        return s;
    }
}