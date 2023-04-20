public class lab7 {
    public static void goodbye() {
        System.out.println("goodbye World");
    }
    public static void hello() {
        System.out.println("Hello World");
        goodbye();
    }
    public static void main(String [] args) {
        hello();
    }
}
