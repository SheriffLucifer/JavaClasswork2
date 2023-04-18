public class task2 {
    public static void main(String[] args) {
        System.out.println(ex2("aaaabbbcdda"));
    }

    static String ex2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = s.toCharArray();
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                stringBuilder.append(array[i - 1]);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(array[array.length - 1]);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
