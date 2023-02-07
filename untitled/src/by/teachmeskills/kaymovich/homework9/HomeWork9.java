package by.teachmeskills.kaymovich.homework9;

import by.teachmeskills.kaymovich.homework9.utils.StringUtils;

import java.util.Scanner;

import static by.teachmeskills.kaymovich.homework9.utils.StringUtils.print;
import static by.teachmeskills.kaymovich.homework9.utils.StringUtils.println;

public class HomeWork9 {
    public static void main(String[] args) {
        String info = """  
                              Select a task by number:
                1. Task IsBlank.
                2. Task isRussian.
                3. Task contains.\
                """;
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
//        char[] string1 = scanner.nextLine().toCharArray();
        switch (input) {
            case (1) -> {
                System.out.println("Input string");
                char[] string = scanner.nextLine().toCharArray();
                print(string);
                System.out.println(". -  This is blank?  -  " + StringUtils.isBlank(string));
            }
            case (2) -> {
                System.out.println("Input string");
                char[] string = scanner.nextLine().toCharArray();
                print(string);
                System.out.println("The array consists of characters of the Russian alphabet?");
                System.out.println(StringUtils.isRussian(string));
            }
            case (3) -> {
                System.out.println("Input string");
                char[] string = scanner.nextLine().toCharArray();
                println(string);
                char[] string2 = scanner.nextLine().toCharArray();
                println(string);
                System.out.println("Do the array strings match?");
                System.out.println(StringUtils.contains(string, string2));
            }
            default -> System.out.println("Wrong input.");
        }
    }
}
