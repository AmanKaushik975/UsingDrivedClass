public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        car c1 = new car();

        String c = c1.getDetails("Tesla");
        System.out.println(c);
    }
}