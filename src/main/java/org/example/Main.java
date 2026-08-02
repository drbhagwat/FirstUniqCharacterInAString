package org.example;

import java.util.*;

public class Main {
    private String input;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        Main main = new Main();
        main.input = main.read();
        main.scanner.close();
        main.print();
        System.out.println(main.firstUniqChar());
    }

    public String read() {
        System.out.print("Enter a String : ");
        return scanner.nextLine();
    }

    public void print() {
        System.out.println(input);
    }

    public int firstUniqChar() {
        Map<Character, Integer> map = new HashMap<>();
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i++) {
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < inputLength; i++) {

            if (map.get(input.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;
    }
}
