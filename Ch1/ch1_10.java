package Ch1;

/*
 * (Average speed in miles) 
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
 * Write a program that displays the average speed in miles per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */
public class ch1_10 {
    public static void main(String[] args) {
        System.out.println((14 / 45.5) * 60 / 1.6);
    }
}

/*
 * public static void main(String[] args) {
 * final double KILOMETERS_TO_MILES_CONVERSION = 1.6;
 * final int MINUTES_IN_AN_HOUR = 60;
 * 
 * double distanceInKilometers = 14.0;
 * int totalMinutes = 45;
 * int seconds = 30;
 * 
 * double totalTimeInHours = totalMinutes / (double) MINUTES_IN_AN_HOUR +
 * seconds / (double) (MINUTES_IN_AN_HOUR * 60);
 * 
 * double averageSpeedInMilesPerHour = distanceInKilometers /
 * KILOMETERS_TO_MILES_CONVERSION / totalTimeInHours;
 * 
 * System.out.println("Average speed: " + averageSpeedInMilesPerHour +
 * " miles per hour");
 * }
 */