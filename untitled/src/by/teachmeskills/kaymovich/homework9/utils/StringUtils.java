package by.teachmeskills.kaymovich.homework9.utils;

public class StringUtils {
    public static void print(char[] array) {
//        for (int i= 0; i <array.length; i++){
//            System.out.println(array[i]);
//        }
        for (char sym : array) {
            System.out.print(sym);
        }
    }

    public static void println(char[] array) {
        print(array);
        System.out.println();
    }

    public static boolean isBlank(char[] array) {
        for (char sym : array) {
            if (!Character.isWhitespace(sym)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char... inputArray) {
        for (char sym : inputArray) {
            if ((sym < 'А' || sym > 'Я') && (sym < 'а' || sym > 'я') && (sym != 'Ё' && sym != 'ё')) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char[] arraysym1, char[] arraysym2) {
        int sum = 0;
        if (arraysym1.length > arraysym2.length) {
            throw new IllegalArgumentException("Incorrect value.");
        }
        for (int i = 0; i < arraysym1.length - 1; i++) {
            for (int j = 0; j < arraysym2.length; j++) {
                if (arraysym1[i + j] != arraysym2[j]) {
                    break;
                } else {
                    sum++;
                }
            }
            if (sum == arraysym2.length)
                return true;
        }
        return false;
    }
}
