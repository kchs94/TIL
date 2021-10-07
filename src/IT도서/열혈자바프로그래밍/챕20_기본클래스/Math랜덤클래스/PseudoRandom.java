package IT도서.열혈자바프로그래밍.챕20_기본클래스.Math랜덤클래스;

import java.util.Random;

public class PseudoRandom {
    public static void main(String[] args) {
        Random rand = new Random(12);

        for(int i=0; i<7; i++){
            System.out.println(rand.nextInt(1000));
        }
    }
}
