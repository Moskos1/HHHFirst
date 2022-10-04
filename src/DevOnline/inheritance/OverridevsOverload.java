package DevOnline.inheritance;

public class OverridevsOverload {
    private static class Parent {
        void method1(){

        }
    }
private static class Child extends Parent {

        void method1(){

        }
}

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
    }
}
