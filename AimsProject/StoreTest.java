package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng (Store)
        Store store = new Store();

        // Tạo một số DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Kiểm tra thêm DVD thành công
        System.out.println("DVDs in store after adding:");
        System.out.println("- " + dvd1.getTitle());
        System.out.println("- " + dvd2.getTitle());
        System.out.println("- " + dvd3.getTitle());

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // Kiểm tra sau khi xóa
        System.out.println("DVDs in store after removing 'Star Wars':");
        System.out.println("- " + dvd1.getTitle());
        System.out.println("- " + dvd3.getTitle());
    }
} 
