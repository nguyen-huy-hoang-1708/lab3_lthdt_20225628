
package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(new DigitalVideoDisc[]{dvd2, dvd3});
        // 3. Sử dụng phương thức nhận hai tham số
        //cart.addDigitalVideoDisc(dvd1, dvd2);

        // 4. Sử dụng phương thức nhận ba tham số
        cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        cart.printCart();

        System.out.println("Search by ID (1): " + cart.searchById(1));
        System.out.println("Search by title (\"Star\"): " + cart.searchByTitle("Star"));
    }
} 

