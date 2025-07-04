class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        //pick the first k sum

        for(int i =0; i<k; i++){
            sum = sum + nums[i];
        }
        double max = (double)sum/k;
        for (int i = k; i<nums.length;i++){
            sum = sum-nums[i-k] + nums[i];
            max = Math.max(max,(double)sum/k);
        }
        return max;
        
    }
}