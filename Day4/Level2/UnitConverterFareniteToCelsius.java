public class UnitConverterFareniteToCelsius {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class

        // Temperature conversion
        double fahrenheit = 98.6;
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");

        double celsius = 37.0;
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

        // Weight conversion
        double pounds = 150.0;
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

        double kilograms = 68.0;
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Volume conversion
        double gallons = 10.0;
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        double liters = 25.0;
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}
