class Solution {
    //
    public void moveZeroes(int[] nums) {

        int writer = 0;
        for (int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
            nums[writer]=nums[i];
            writer++;
            }
        }
        for(int  i = writer; i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}