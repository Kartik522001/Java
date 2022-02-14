import java.util.HashMap;

public class MapDemo {
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1, "one");
        hm.put(-1, "-one");
        hm.put(2, "two");
        hm.put(-1000, "one thousand");
        hm.put(1000, "one zero zero zero");


        System.out.println(hm.size());
        System.out.println(hm);

        System.out.println(hm.get(1));
        System.out.println(hm.get(11));
        
    }
}
