/*
Operatori:
aritimetici: +, -, /, *, %
de comparare: <, >, ==, >=, <=
logici: &&, ||, !

 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = b;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a * b);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(7>b && 3>b); //7>5 si 3>5?
        System.out.println(7>b || 3>b); //7>5 sau 3>5?
        System.out.println(!(7>b));
    }
}
