

package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng (Cart)
        Cart cart = new Cart();

        // Tạo một số DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Thêm DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // In ra nội dung của giỏ hàng
        cart.printCart();

        // Tìm kiếm DVD trong giỏ hàng
        System.out.println("Search by ID (2): " + cart.searchById(2));
        System.out.println("Search by title (\"Lion\"): " + cart.searchByTitle("Lion"));
    }
}


