class A extends Thread
{
    public void run()
    {
        for(int i =0; i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class C extends Thread{
    public void run()
    {
        for(int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}


public class thread {
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        obj1.start();
        obj2.start();
        obj3.start();
    }    
}
