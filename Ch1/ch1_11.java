package Ch1;

import java.text.DecimalFormat;

/*
 * (Population projection) 
 * The U.S. Census Bureau projects population based on the following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the current 
 * population is 312,032,486 and one year has 365 days. 
 * Hint: In Java, if two integers perform division, the result is an integer. 
 * The fractional part is truncated. 
 * For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
 * To get an accurate result with the fractional part, 
 * one of the values involved in the division must be a number with a decimal point. 
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class ch1_11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;

        // 1 year = 365 days >*24hr = 8760 hr >*60min =525,600min > *60sec =31,536,000
        // second
        int yearInSecond = 365 * 24 * 60 * 60;
        double birthPerYear = yearInSecond / 7.0;
        double deathPerYear = yearInSecond / 13.0;
        double immigrantPerYear = yearInSecond / 45.0;

        double populationYear1 = currentPopulation + birthPerYear - deathPerYear + immigrantPerYear;
        double populationYear2 = populationYear1 + birthPerYear - deathPerYear + immigrantPerYear;
        double populationYear3 = populationYear2 + birthPerYear - deathPerYear + immigrantPerYear;
        double populationYear4 = populationYear3 + birthPerYear - deathPerYear + immigrantPerYear;
        double populationYear5 = populationYear4 + birthPerYear - deathPerYear + immigrantPerYear;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Year 1 : " + decimalFormat.format(populationYear1));
        System.out.println("Year 2 : " + decimalFormat.format(populationYear2));
        System.out.println("Year 3 : " + decimalFormat.format(populationYear3));
        System.out.println("Year 4 : " + decimalFormat.format(populationYear4));
        System.out.println("Year 5 : " + decimalFormat.format(populationYear5));
    }
}

/*
 * code from chatGPT
 * 
 * public class PopulationProjection {
 * public static void main(String[] args) {
 * // Constants
 * final int SECONDS_PER_MINUTE = 60;
 * final int MINUTES_PER_HOUR = 60;
 * final int HOURS_PER_DAY = 24;
 * final int DAYS_PER_YEAR = 365;
 * 
 * // Initial population
 * int currentPopulation = 312032486;
 * 
 * // Calculate the number of seconds in a year
 * int secondsPerYear = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY *
 * DAYS_PER_YEAR;
 * 
 * // Birth, death, and immigrant rates
 * int birthsPerYear = secondsPerYear / 7;
 * int deathsPerYear = secondsPerYear / 13;
 * int immigrantsPerYear = secondsPerYear / 45;
 * 
 * // Calculate the population for each of the next five years
 * for (int i = 1; i <= 5; i++) {
 * currentPopulation += birthsPerYear - deathsPerYear + immigrantsPerYear;
 * System.out.println("Year " + i + ": " + currentPopulation);
 * }
 * }
 * }
 * 
 */