
package hust.soict.dsai.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123); // Tạo đối tượng Random với seed cố định
        long start = System.currentTimeMillis(); // Ghi lại thời gian bắt đầu

        // Phần 1: Sử dụng String
        String s = "";
        for (int i = 0; i < 65536; i++) { // Vòng lặp nối chuỗi 65536 lần
            s += r.nextInt(2); // Nối thêm số ngẫu nhiên (0 hoặc 1)
        }
        System.out.println(System.currentTimeMillis() - start); // In ra thời gian thực hiện

        // Phần 2: Sử dụng StringBuilder
        r = new Random(123); // Khởi tạo lại Random với cùng seed
        start = System.currentTimeMillis(); // Ghi lại thời gian bắt đầu
        StringBuilder sb = new StringBuilder(); // Tạo đối tượng StringBuilder
        for (int i = 0; i < 65536; i++) { // Vòng lặp thêm chuỗi vào StringBuilder
            sb.append(r.nextInt(2)); // Thêm số ngẫu nhiên (0 hoặc 1)
        }
        s = sb.toString(); // Chuyển StringBuilder thành String
        System.out.println(System.currentTimeMillis() - start); // In ra thời gian thực hiện
    }
}
