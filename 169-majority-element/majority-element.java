class Solution {
    //
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for(int num:nums){
            if (count == 0) candidate = num;
            count+=(candidate==num) ? 1:-1;
        }
        return candidate;
    }

    
    



    public int majorityElementBruteForce(int[] nums) {
        int n = nums.length;
        int target = n/2;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>target) return i;
        }
        return 0;
    }
}