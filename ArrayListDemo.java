import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // list.add("ram");
        // list.add("ravan");
        // list.add("sita");
        list.add(10);
        list.add(12);
        list.add(1);

        System.out.println(list);
        list.get(1);
        list.remove(0);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(20));
        list.add(20);

        System.out.println(list);


        ArrayList<Integer> icic = new ArrayList<>();
        icic.add(20);
        icic.add(40);
        icic.add(30);

        ArrayList<Integer> pnb = new ArrayList<>();
        pnb.add(1);
        pnb.add(2);
        pnb.add(3);

        icic.addAll(pnb);

        System.out.println(icic);

    }

    synchronized void add(){

    }
    void remove(int index){
        
    }
}