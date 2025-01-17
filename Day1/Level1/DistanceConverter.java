 class DistanceConverter {
    public static void main(String[] args) {
        // Define the distance in kilometers
        double distanceInKilometers = 10.8;

        // Conversion factor (1 km = 1.6 miles)
        double conversionFactor = 1.6;

        // Convert the distance to miles
        double distanceInMiles = distanceInKilometers * conversionFactor;

        // Display the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles + ".");
    }
}
