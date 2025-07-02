class Solution {
    public int maxSubArray(int[] nums){

        //tc - O(N) // sc - O(1)

    int max = nums[0];
    int sum = nums[0];

    for (int i = 1; i<nums.length; i++){
        sum  = sum + nums[i];
        sum = Math.max(sum,nums[i]);
        max = Math.max(sum,max);
    }
    return max;
    }
    
    public int maxSubArrayBruteForce(int[] nums) {
        //Brute Force Approach

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum = sum + nums[j];
                max = Math.max(max,sum);
            }

        }
        return max;
        
    }
}