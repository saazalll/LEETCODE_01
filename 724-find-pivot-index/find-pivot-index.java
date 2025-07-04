class Solution {
    //
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        // precompute sum

        for (int i : nums){
            sum = sum +i;
        }
        int leftSum = 0;
        for(int i = 0; i<nums.length;i++){
            int rightSum = sum - leftSum - nums[i];

            if(leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}