import java.util.Scanner;

class ElectricityBill {
    int CustomerNo, Pre, Curr, ExactReading, EB_Connec;
    String Cust_Name;
    double Bill;

    void input_data() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Your EB Number : ");
        CustomerNo = r.nextInt();
        System.out.println("Enter Your Consumer Name");
        Cust_Name = r.next();
        System.out.println("Enter Your Previous Month Unit");
        Pre = r.nextInt();
        System.out.println("Enter Youe Current Month Unit");
        Curr = r.nextInt();
        System.out.println("Enter Your Type of EB Connection \n1.Domestic \n2.Commercial  ");
        EB_Connec = r.nextInt();
        ExactReading = Curr - Pre;
        System.out.println("Total Unit you utilized : " + ExactReading);
    }

    double Calculate() {
        int Choice;
        if (EB_Connec == 1) {
            if (ExactReading >= 0 && ExactReading <= 100)
                Bill = ExactReading * 1;
            else if (ExactReading >= 101 && ExactReading <= 200)
                Bill = (100) + (ExactReading - 100) * 2.5;
            else if (ExactReading > 200 && ExactReading <= 500)
                Bill = 100 + 250 + (ExactReading - 200) * 4;
            else
                Bill = 100 + 250 + 1200 + (ExactReading - 500) * 6;
            // return Bill;
        } else {
            if (ExactReading >= 0 && ExactReading <= 100)
                Bill = ExactReading * 2;
            else if (ExactReading >= 101 && ExactReading <= 200)
                Bill = (200) + (ExactReading - 100) * 4.5;
            else if (ExactReading >= 200 && ExactReading <= 500)
                Bill = 200 + 450 + (ExactReading - 200) * 6;
            else
                Bill = 200 + 450 + 1800 + (ExactReading - 500) * 7;
            // return Bill;
        }
        return Bill;
    }

    void Display() {
        System.out.println("===========================================");
        System.out.println("Customer Name : " + Cust_Name);
        System.out.println("Customer EB No : " + CustomerNo);
        System.out.println("Previous Month Reading : " + Pre);
        System.out.println("Current Month Reading : " + Curr);
        System.out.println("Total Unit you utilized : " + ExactReading);
        System.out.println("Price : " + Calculate());
        System.out.println("===========================================");

    }
}

class Main {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.input_data();
        eb.Display();
    }
}
