class Solution {
    public int[] twoSum(int[] nums, int target) {
     if (nums.length < 2 || nums.length > 10000000) {
        throw new RuntimeException("nums is not valid");
     }   
     if (target < -10000000 || target > 10000000) {
        throw new RuntimeException("target is not valid");
     } 
     for (int i = 0; i < nums.length; i++) {
        if (nums[i] < -10000000 || nums[i] > 10000000) {
            throw new RuntimeException("num is not valid");
        } 
        for (int j = i + 1; j < nums.length; j++){
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            } 
        }
     }
    return new int[]{};
    }
}
