import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fTemp = scanner.nextDouble();
            double cTemp = fahrenheitToCelsius(fTemp);
            System.out.printf("%.2f°F is equal to %.2f°C%n", fTemp, cTemp);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double cTemp = scanner.nextDouble();
            double fTemp = celsiusToFahrenheit(cTemp);
            System.out.printf("%.2f°C is equal to %.2f°F%n", cTemp, fTemp);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }
}
