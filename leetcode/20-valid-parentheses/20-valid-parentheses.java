class Solution {
    public static boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}', '{');

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArr) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')' || c == ']' || c == '}') {
                if (stack.empty() || stack.pop() != pair.get(c)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}