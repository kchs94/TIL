package IT도서.JAVA객체지향과디자인패턴.src.챕터2.문제4.개선전;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setMode("NonDiscounted");

        Song song2 = new Song();
        song2.setMode("NonDiscounted");

        Song song3 = new Song();
        song3.setMode("OnSale");

        Song song4 = new Song();
        song4.setMode("TodayEvent");

        Cart cart = new Cart();
        cart.add(song1);
        cart.add(song2);
        cart.add(song3);
        cart.add(song4);

        System.out.println(cart.CalculateTotalPrice());
    }
}
