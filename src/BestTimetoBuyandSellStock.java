public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,2,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {

        // get index of minimum element
        int min = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<prices[min])
                min = i;
        }

        // search for largest element in the range of min to array length
        int max = prices[min];
        for (int i = min; i < prices.length; i++) {
            if (prices[i]>max)
                max = prices[i];
        }

        return max-prices[min];
    }
}
