public class A {

    public void a() {
        System.out.println("A");
    }
}

public class B {

    public void b() {
        System.out.println("B");
    }
}

public class C {

    public void c() {
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        A aInstance = new A();
        aInstance.a(); // Prints "A"

        B bInstance = new B();
        bInstance.b(); // Prints "B"

        C cInstance = new C();
        cInstance.c(); // Prints "C"
    }
}

