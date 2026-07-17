class Solution {
    public int maxProfit(int[] arr) {
        int profit = 0;

        // Start from Day 1 because we compare
        // today's price with yesterday's price.
        for (int i = 1; i < arr.length; i++) {

            // If price increased,
            // take today's profit.
            if (arr[i] > arr[i - 1]) {

                profit += arr[i] - arr[i - 1];
            }

            /*
            **************** THEORY ****************

            We don't need to find
            local minima and maxima separately.

            Every increase contributes
            to the final answer.

            Example:

            1 2 3 4 5

            (2-1)+(3-2)+(4-3)+(5-4)

            =5-1

            Same answer.

            ****************************************

            *********** MISTAKES ***********

            ❌ Don't use Running Minimum.

            Running Minimum is only for
            ONE transaction.

            --------------------------------

            ❌ Don't use Kadane.

            This is not Maximum Subarray Sum.

            --------------------------------

            ❌ Don't buy multiple stocks.

            Sell before buying again.

            */
        }

        return profit;
    }
}