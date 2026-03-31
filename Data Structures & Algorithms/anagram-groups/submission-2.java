class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        if (isStrsValid(strs)) {
            for (String str: strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sortedstr = new String(charArray);
                resultMap.computeIfAbsent(sortedstr, k -> new ArrayList<>()).add(str);
            }
            return new ArrayList<>(resultMap.values());
        } else {
            return new ArrayList<>();
        }
    }

    private boolean isStrsValid(String[] strs) {
        if (strs == null) return false;
        if (strs.length < 1 || strs.length > 1000) {
            return false;
        }
        for (String str: strs) {
            if (!isStrValid(str)) return false;
        }
        return true;
    }

    private boolean isStrValid(String str) {
        if (str == null) return false;
        char[] strChar = str.toCharArray();
        if (strChar.length > 100 ) return false;
        for (char c: strChar) {
            if (c < 'a' || c > 'z') return false;
        } 
        return true;
    }
}
