public class Main {

    public static void main(String[] args) {
        Cat c1 = new Cat("Meow");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Woof");
        Dog d2 = new Dog("Woooff");
        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        d1.greets(d2);
    }
}
