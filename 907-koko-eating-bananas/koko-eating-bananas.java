class Solution {

    public static boolean kyaBanana(int mid, int[] piles, int h) {
        long totalTimes = 0;

        for (int i = 0; i < piles.length; i++) {
            totalTimes += (piles[i] + mid - 1) / mid; // ceil division
        }

        return totalTimes <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int banana : piles) {
            high = Math.max(high, banana);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (kyaBanana(mid, piles, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
