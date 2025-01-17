class DiscountCalculator {
    public static void main(String[] args) {
        // Original fee and discount percent
        double fee = 125000;
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Output the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
