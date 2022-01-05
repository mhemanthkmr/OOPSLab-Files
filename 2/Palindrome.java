import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        String s, reverse = "";
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a String : ");
        s = r.next();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");
    }
}