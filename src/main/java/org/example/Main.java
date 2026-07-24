package org.example;

import java.util.*;

public class Main {
    private String input;

    public static void main() {
        Main main = new Main();
        main.read();
        main.print();
        System.out.println(main.firstUniqChar(main.getInput()));
    }

    private String getInput() {
        return input;
    }

    public void read() {
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        scanner.close();
    }

    public void print() {
        System.out.println(getInput());
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int frequency = map.get(c);
                frequency++;
                map.put(c, frequency);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : s.toCharArray()) {
            Integer value = map.get(c);

            if (value == 1) {
                return(s.indexOf(c));
            }
        }
        return -1;
    }
}
