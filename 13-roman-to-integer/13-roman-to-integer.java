class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanSymbolMap = new HashMap<>();
        romanSymbolMap.put("M", 1000);
        romanSymbolMap.put("CM", 900);
        romanSymbolMap.put("D", 500);
        romanSymbolMap.put("CD", 400);
        romanSymbolMap.put("C", 100);
        romanSymbolMap.put("XC", 90);
        romanSymbolMap.put("L", 50);
        romanSymbolMap.put("XL", 40);
        romanSymbolMap.put("X", 10);
        romanSymbolMap.put("IX", 9);
        romanSymbolMap.put("V", 5);
        romanSymbolMap.put("IV", 4);
        romanSymbolMap.put("I", 1);

        int answer = 0;

        for (int idx = 0; idx < s.length(); ) {
            String twoChSubStr = s.substring(idx, Math.min(s.length(), idx + 2));
            String oneChSubStr = s.substring(idx, idx + 1);

            if (romanSymbolMap.containsKey(twoChSubStr)) {
                answer += romanSymbolMap.get(twoChSubStr);
                idx += 2;
            } else {
                answer += romanSymbolMap.get(oneChSubStr);
                idx++;
            }
        }

        return answer;
    }
}