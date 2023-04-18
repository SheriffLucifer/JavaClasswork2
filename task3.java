public class task3 {
    public static void main(String[] args) {
        System.out.println(ex3("А роза упала на лапу Азора"));
    }

    static boolean ex3(String s) {
        s = s.replace(" ", "");
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.reverse();
        return stringBuilder1.toString().equalsIgnoreCase(s);
    }
}
