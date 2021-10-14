package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.문제29_2;

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

    public String getModel(){
        return model;
    }
}

public class ToyStream {
    public static void main(String[] args) {
        List<ToyPriceInformation> list = new ArrayList<>();

        list.add(new ToyPriceInformation("GUN_LR_45", 200));
        list.add(new ToyPriceInformation("TEDDY_BEAR_S_014", 350));
        list.add(new ToyPriceInformation("CAR_TRANSFORM_VER_7719", 550));

        list.stream() // 스트림 생성
                .filter(p -> 10 < p.getModel().length())    // 중간 연산자1
                .map(t -> t.getModel())        // 중간 연산자2
                .forEach(s -> System.out.print(s + "\t")); // 최종 연산자
    }

}
