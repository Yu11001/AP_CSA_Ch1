package Ch1;

/*
 * (Area and perimeter of a circle) 
 * Write a program that displays the area and perimeter of a circle 
 * that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 * 
 * note : pi can be writen as Math.PI in java which is belong to java.lang.Math class.
 */
public class ch1_8 {
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI; // pi = Math.PI
        // note: java.lang.Math.pow():
        // a : this parameter is the base
        // b : this parameter is the exponent
        // Math.pow(a,b) : a to the b > a^b

        double area = Math.PI * Math.pow(radius, 2); // =radius^2 > radius*radius

        System.out.println("perimeter: " + perimeter);
        System.out.println("area: " + area);
    }
}

// or just compute it
// System.out.println(5.5 * 5.5 * 3.14159);
// System.out.println(2 * 5.5 * 3.14159);