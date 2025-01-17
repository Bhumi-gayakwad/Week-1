 class ProfitLossCalculator {
    public static void main(String[] args) {
        // Given values for cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display the results using a single print statement for multiline text
        System.out.println("The Cost Price is " + costPrice + " and Selling Price is " + sellingPrice);
        System.out.println("The Profit is " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
