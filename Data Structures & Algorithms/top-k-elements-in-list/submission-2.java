class Solution {
    public int[] topKFrequent(int[] nums, int k) {  
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //((1,1), (2, 2), (3,3))
        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        List<Map.Entry<Integer, Integer>> sortedMapList = mapList.stream().sorted((Map.Entry.comparingByValue())).toList();
        //((1,1), (2, 2), (3,3))
        if (sortedMapList.size() <= k) {
            for (int i = 0; i < sortedMapList.size() ; i++) {
                result.add(sortedMapList.get(i).getKey());
            }   
        } else {
            //((1,1), (2, 2), (3,3))
            int counter = 0;
            for (int i = sortedMapList.size() - 1; i >= 0 ; i--) {
                counter++;
                if (counter > k) {
                    break;
                }
                result.add(sortedMapList.get(i).getKey());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
