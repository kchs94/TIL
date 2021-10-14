package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.ToyStream;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInformation {
    private String model;
    private int price;

    public ToyPriceInformation(String model, int price){
        this.model = model;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class ToyStream {
    public static void main(String[] args) {
        List<ToyPriceInformation> list = new ArrayList<>();

        list.add(new ToyPriceInformation("GUN_LR_45", 200));
        list.add(new ToyPriceInformation("TEDDY_BEAR_S_014", 350));
        list.add(new ToyPriceInformation("CAR_TRANSFORM_VER_7719", 550));

        int sum = list.stream() // 스트림 생성
                        .filter(p -> p.getPrice() < 500)    // 중간 연산자1
                        .mapToInt(t -> t.getPrice())        // 중간 연산자2
                        .sum(); // 최종 연산자
        System.out.println("sum = " + sum);
    }
}
