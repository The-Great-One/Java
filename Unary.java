public class Unary {
    public static void main(String[] args) {
        int a = 15, b = 20;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        System.out.println("--INCREMENT--");

        int i = ++a;
        int j = ++b;
        System.out.println("A = " + i);
        System.out.println("B = " + j);
        System.out.println("--DECREMENT--");
        a = 15;
        b = 20;

        i = --a;
        j = --b;
        System.out.println("A = " + i);
        System.out.println("B = " + j);

    }

}
