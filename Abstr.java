abstract class A {
    abstract void add();

    void sub() {
        System.out.println("This is non abstract method");
    }
}

interface B{
    float PI =  3.14f;
    void mult();
}
final class C{
    final int x = 3;
    void div(){
        System.out.println("Helo div from final");
    }
}

public class Abstr extends A implements B {
    public void mult() {
        System.out.println("This is mul of interface");
    }

    void add() {
        System.out.println("This is the imepemenataed method");
    }

    public static void main(String args[]) {
        C obj = new C();
        Abstr obj1 = new Abstr();
        obj1.add();
        obj1.mult();
        obj.div();
    }
}