package IT도서.JAVA객체지향과디자인패턴.src.챕터2.문제4.개선후;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setMode(new NonDiscounted());

        Song song2 = new Song();
        song2.setMode(new NonDiscounted());

        Song song3 = new Song();
        song3.setMode(new OnSale());

        Song song4 = new Song();
        song4.setMode(new TodayEvent());

        Cart cart = new Cart();
        cart.add(song1);
        cart.add(song2);
        cart.add(song3);
        cart.add(song4);

        System.out.println(cart.CalculateTotalPrice());
    }
}
