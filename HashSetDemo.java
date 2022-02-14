
// import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String args[]){
        // HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(-10);
        ts.add(30);
        ts.add(100);
        ts.add(500);
        ts.add(2);
        ts.add(500);

        System.out.println(ts.size());

        System.out.println(ts);

        System.out.println(ts.contains(500));
        System.out.println(ts.remove(500));
        System.out.println(ts.contains(500));

        System.out.println(ts.subSet(20, true,500,true));
    }
}
