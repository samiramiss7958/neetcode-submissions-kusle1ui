class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            if (!numsSet.add(num)) {
                return true;
            }
        }
        return false;
        //int numsLength = nums.length;
        //Set<Integer> numsSet = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        //return numsSet.size() == numsLength ? false : true;
    }
}