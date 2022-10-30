import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("bmw");
        arr.add("pontiac");
        arr.add(null);
        arr.add(null);
        arr.add("toypta");

        arr.removeIf(a -> a==null || a.equalsIgnoreCase("bmw"));
        System.out.println(arr);
    }
}
