package Ch1;

/*
 * (Approximatep) p can be computed using the following formula:
 * pi = 4*(1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + ...) and
 * 
 * Write a program that displays the result of 
 * 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and 
 * 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * use 1.0 instead of 1 in your program.
 */
public class ch1_7 {
    public static void main(String[] args) {
        double a = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double b = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);

        System.out.println(a);
        System.out.println(b);
    }
}
