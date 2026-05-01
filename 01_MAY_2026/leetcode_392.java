

import java.util.*;

public class leetcode_392 {

    public static boolean isSubsequence(String s, String t) {
        int idx = 0;

        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(idx) == t.charAt(i)) {
                idx++;
            }

            if (idx == s.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();

        boolean result = isSubsequence(s, t);
        System.out.println("Result: " + result);

        sc.close();
    }
}