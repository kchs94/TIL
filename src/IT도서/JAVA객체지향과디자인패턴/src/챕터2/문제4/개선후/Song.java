package IT도서.JAVA객체지향과디자인패턴.src.챕터2.문제4.개선후;

public class Song {
    private DiscountMode mode;

    public DiscountMode getMode(){
        return mode;
    }

    public void setMode(DiscountMode mode){
        this.mode = mode;
    }

    public double getPrice(){
        return 10.0 - (10.0 * mode.getDiscountRate());
    }
}
