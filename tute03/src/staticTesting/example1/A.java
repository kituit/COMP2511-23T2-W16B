package staticTesting.example1;

public class A {
    public static void f() {
        C c = new C();
        c.speak(); // Quack
        B b = c;
        b.speak(); // Quack
        b = new B();
        b.speak(); // Moo
        c.speak(); // Quack
    }

    public static void main(String[] args) {
        A.f();
    }
}

// public class B {
//     public void speak() {
//         System.out.println("moo");
//     }
// }


// public class C extends B {
//     public void speak() {
//         System.out.println("quack");
//     }
// }

