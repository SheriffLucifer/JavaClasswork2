import java.io.FileWriter;

public class task4 {
    public static void main(String[] args) {
        ex4("Test", 20);
    }

    static void ex4(String s, int n) {
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s) {
        String path = "test.txt";
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String repeatString(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
