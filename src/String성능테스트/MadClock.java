package String성능테스트;
/*
* 시간 측정, 결과 출력 클래스
* */
public class MadClock {
    private long startTime;
    private long endTime;

    public void startClock(){
        startTime = System.nanoTime();
    }

    public void stopClock(){
        endTime = System.nanoTime();
    }

    public void printResult(String clockName){

    }
}
