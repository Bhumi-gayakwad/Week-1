 public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;  // Generates a number between 100000 and 999999
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areUniqueOTPs(int[] otps) {
        // Check each pair of OTPs to see if there are any duplicates
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP #" + (i + 1) + ": " + otps[i]);
        }

        // Check if OTPs are unique
        if (areUniqueOTPs(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
