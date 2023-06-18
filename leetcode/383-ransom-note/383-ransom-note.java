class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
        int[] list = new int[26];
        for( int i = 0; i < 26; i++ ) {
            list[i] = 0;
        }
        int len = magazine.length();

        for(int i = 0; i < len; i++) {
            list[magazine.charAt(i) - 'a']++;
        }

        len = ransomNote.length();

        for(int i = 0; i < len; i++) {
            char key = ransomNote.charAt(i);
            if(list[key - 'a'] >= 1) {
                list[key-'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}