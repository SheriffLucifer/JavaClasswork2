public class task1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 10;
        System.out.println(ex1(c1, c2, n));
    }

    static String ex1(char c1, char c2, int n) {
        if (n % 2 != 0) {
            return "Вы ввели нечетное число!";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}