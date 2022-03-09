import java.util.ArrayList;
import java.util.Arrays;

public class String_to_ArrayList {
    public static void main(String[] args) {
        String msg = "Hello Everyone";
        System.out.println(msg);
        // string to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(msg.split(" ")));
        list.forEach(System.out::println);
    }
}