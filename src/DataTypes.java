import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        long x = 500_000_500_000L;
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
        }
        System.out.println(sum(lst));
    }
}
