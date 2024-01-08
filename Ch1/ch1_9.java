package Ch1;

import java.text.DecimalFormat;

/*
 * (Area and perimeter of a rectangle) Write a program that displays the area and 
 * perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following 
 * formula: area = width * height
 */

public class ch1_9 {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;

        // result might be contain the floating point number -IEEE 754
        System.out.println("area : " + area);

        // if you don't want to present the floating number.
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String decimalResult = decimalFormat.format(area);

        System.out.println("decimal format area : " + decimalResult);
    }
}
