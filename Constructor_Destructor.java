import java.util.*;

class cls1 {
    int Mark1, Mark2, Mark3, Mark4, Mark5, Avg, Tot;

    public cls1(int m1, int m2, int m3, int m4, int m5) {
        this.Mark1 = m1;
        this.Mark2 = m2;
        this.Mark3 = m3;
        this.Mark4 = m4;
        this.Mark5 = m5;
    }

    public void Calculate() {
        int t = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
        System.out.println("Total Mark is : " + t);
        System.out.println("Average is  : " + t / 5);
    }

}

public class Constructor_Destructor {
    public static void main(String[] args) {
        System.out.println("Enter the mark one by one : ");
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        int M1 = sc.nextInt();
        int M2 = sc.nextInt();
        int M3 = sc.nextInt();
        int M4 = sc.nextInt();
        int M5 = sc.nextInt();
        cls1 ob = new cls1(M1, M2, M3, M4, M5);
        ob.Calculate();
    }
}