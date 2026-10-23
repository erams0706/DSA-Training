class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int sum=n*(n+1)/2;
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum=current_sum + nums[i];
        }
        int missingNumber= sum-current_sum;
        return missingNumber;
    }
}