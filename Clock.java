import java.util.Scanner;

class Clock {
    public static void main(String[] args) {
        try {
            int hours, minutes;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the hours");
            hours = sc.nextInt();

            System.out.println("Enter the minute");
            minutes = sc.nextInt();

            if (hours > 24) {
                System.out.println("Invalid hours");
            }
            if (minutes > 60) {
                System.out.println("Invalid minutes");
            }
        } catch (Exception e) {
            System.out.println("Exceptions is catched");
        } finally {
            System.out.println("End of the program");
        }
    }
}