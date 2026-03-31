class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: strs) {
            int length = str.length();
            stringBuilder.append(length).append("#").append(str);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int lenghtOfString = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + lenghtOfString));
            i = j + 1 + lenghtOfString; 
        }
        return result;
    }
}

//Rule for encoding: <Length>#<String>
//What if we have this pattern in one of the strings?
//4#fght7#jkvfrdk2#as