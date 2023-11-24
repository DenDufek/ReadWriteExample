import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Ім'я файлу
        String fileName = "example.txt";

        // Запис у файл
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Це довільні дані для запису в файл.");
            writer.println("Додайте більше рядків, якщо потрібно.");
        } catch (IOException e) {
            System.err.println("Помилка при записі в файл: " + e.getMessage());
        }

        // Зчитування з файлу та виведення на консоль
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Зміст файлу:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }
}
