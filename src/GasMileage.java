import java.util.Scanner;
         /* QUESTION
    * 4.17 (Gas Mileage) Drivers are concerned with the mileage their
automobiles get. One driver has kept track of several trips by recording the
miles driven and gallons used for each tankful. Develop a Java application
that will input the miles driven and gallons used (both as integers) for each
trip. The program should calculate and display the miles per gallon
obtained for each trip and print the combined miles per gallon obtained for
all trips up to this point. All averaging calculations should produce
floating-point results. Use class Scanner and sentinel-controlled
iteration to obtain the data from the user.
  */

    //ALGORITHM
    /*
-Initialize totalMiles and totalGallons to 0.
-Initialize a counter variable.
-Use a while loop with a sentinel value to repeatedly input miles driven and gallons used for each trip until the sentinel value is entered.
-Within the loop, calculate miles per gallon for each trip and display it.
-Update totalMiles and totalGallons by adding the miles and gallons for each trip.
-Calculate combined miles per gallon by dividing totalMiles by totalGallons.
-Display the combined miles per gallon.
     */

    public class GasMileage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int totalMiles = 0;
            double totalGallons = 0.0;
            int tripCounter = 0;

            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = scanner.nextInt();

            while (miles != -1) {
                System.out.print("Enter gallons used: ");
                double gallons = scanner.nextDouble();

                double milesPerGallon = (double) miles / gallons;

                System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

                totalMiles += miles;
                totalGallons += gallons;
                tripCounter++;

                System.out.print("Enter miles driven (-1 to quit): ");
                miles = scanner.nextInt();
            }

            if (tripCounter > 0) {
                double combinedMilesPerGallon = totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f%n", combinedMilesPerGallon);
            } else {
                System.out.println("No data entered.");
            }

            scanner.close();
        }
    }

