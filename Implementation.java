class Animal{
    int legs;
    String color;
    public Animal(){
        System.out.println("this is the constructor of dog");
    }
    void eat(){
        System.out.println("The animal eats");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog constructor of dog");
    }
    void bork(){
        System.out.println("BOW BOW");
    }
}

class Cat extends Animal{
    public Cat(){
        System.out.println("Cat constructor of cat");
    }
    void mew(){
        System.out.println("MEW MEW");
    }
}

public class Implementation{
    public static void main(String args[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.bork();
        cat.eat();
        cat.mew();
    }
}