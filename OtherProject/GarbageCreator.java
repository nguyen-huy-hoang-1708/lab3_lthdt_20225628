
package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("large_text_file.txt"))) {
            String line;
            String content = ""; // Chuỗi ban đầu rỗng

            while ((line = br.readLine()) != null) {
                content += line; // Mỗi lần nối chuỗi, tạo một đối tượng mới
            }

            System.out.println("Độ dài chuỗi: " + content.length());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}