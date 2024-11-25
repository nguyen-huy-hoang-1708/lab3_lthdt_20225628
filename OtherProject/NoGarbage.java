
package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("large_text_file.txt"))) {
            String line;
            StringBuilder content = new StringBuilder(); // Sử dụng StringBuilder để nối chuỗi

            while ((line = br.readLine()) != null) {
                content.append(line); // Nối chuỗi trực tiếp vào bộ nhớ
            }

            System.out.println("Độ dài chuỗi: " + content.length());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
