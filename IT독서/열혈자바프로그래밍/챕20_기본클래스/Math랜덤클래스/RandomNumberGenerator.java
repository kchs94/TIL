package IT독서.열혈자바프로그래밍.챕20_기본클래스.Math랜덤클래스;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        
        for(int i=0; i<7; i++){
            System.out.println(rand.nextInt(1000)); // 0이상 1000 미만 난수 생성
        }


    }
}
