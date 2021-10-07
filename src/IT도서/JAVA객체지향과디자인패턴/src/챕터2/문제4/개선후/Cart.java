package IT도서.JAVA객체지향과디자인패턴.src.챕터2.문제4.개선후;

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

            total = total + song.getPrice();
        }
        return total;
    }

    public void add(Song song){
        cart.add(song);
    }
}
