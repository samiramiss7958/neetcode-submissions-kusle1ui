class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        if (sCharArray.length == tCharArray.length){
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);
            return Arrays.equals(sCharArray, tCharArray);
        }
        return false;
    }
}
