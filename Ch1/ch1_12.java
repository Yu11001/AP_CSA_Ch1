package Ch1;

/*
 * (Average speed in kilometers) 
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
 * Write a program that displays the average speed in kilometers per hour. 
 * (Note that 1 mile is 1.6 kilometers.)
 */
public class ch1_12 {
    public static void main(String[] args) {
        System.out.println((24.0 * 1.6) / (1.0 + (40.0 / 60.0) + (35.0 / (60.0 * 60.0))));
    }
}

/*
 * solution from chatGPT
 * final double MILES_TO_KILOMETERS_CONVERSION = 1.6;
 * final int MINUTES_IN_AN_HOUR = 60;
 * final int SECONDS_IN_A_MINUTE = 60;
 * 
 * // Given values
 * double distanceInMiles = 24.0;
 * int hours = 1;
 * int minutes = 40;
 * int seconds = 35;
 * 
 * // Convert time to hours
 * double totalTimeInHours = hours + minutes / (double) MINUTES_IN_AN_HOUR
 * + seconds / (double) (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
 * 
 * // Calculate average speed in kilometers per hour
 * double averageSpeedInKilometersPerHour = distanceInMiles *
 * MILES_TO_KILOMETERS_CONVERSION / totalTimeInHours;
 * 
 * // Display the result
 * System.out.println("Average speed: " + averageSpeedInKilometersPerHour +
 * " kilometers per hour");
 */