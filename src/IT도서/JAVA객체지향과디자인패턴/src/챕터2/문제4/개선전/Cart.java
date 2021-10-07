package IT도서.JAVA객체지향과디자인패턴.src.챕터2.문제4.개선전;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    List<Song> cart = new ArrayList<>();

    public double CalculateTotalPrice(){
        double total = 0.0;
        Iterator<Song> iterator = cart.iterator();

        while(iterator.hasNext()){
            Song song = iterator.next();

            if(song.getMode().equals("OnSale"))
                total = total + (song.getPrice() - 0.1 * song.getPrice());
            else if(song.getMode().equals("TodayEvent"))
                total = total + (song.getPrice() - 0.3 * song.getPrice());
            else if(song.getMode().equals("ChristmasSale")) // 문제점: 요구사항이 변경될 때마다 메소드를 수정해야됨.
                total = total + (song.getPrice() - 0.5 * song.getPrice());  // 해결법: 상속(일반화 관계)으로 할인모드 은닉
            else
                total = total + song.getPrice();
        }
        return total;
    }

    public void add(Song song){
        cart.add(song);
    }


}
