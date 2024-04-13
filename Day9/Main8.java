class Animal {
    void me() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void me() {
        System.out.println("Cat");
    }
}

class Dog extends Animal {
    void me() {
        System.out.println("Dog");
    }
}

public class Main8 {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.me();
        a = new Cat();
        a.me();
    }

}
