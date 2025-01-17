public class EarthVolume {
    public static void main(String[] args) {
        // Constants
        double radiusInKm = 6378;  // Radius of the Earth in kilometers

        // Volume of the Earth in cubic kilometers (V = 4/3 * π * r^3)
        double volumeInKm3 = (4.0 / 3.0) * 3.14 * Math.pow(radiusInKm, 3);

        // Conversion factor from cubic kilometers to cubic miles
        double km3ToMiles3 = 0.621371 * 0.621371 * 0.621371;  // 1 km^3 = 0.621371^3 miles^3

        // Volume of the Earth in cubic miles
        double volumeInMiles3 = volumeInKm3 * km3ToMiles3;

        // Output the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm3 + " and cubic miles is " + volumeInMiles3);
    }
}
