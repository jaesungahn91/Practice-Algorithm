class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineArr = magazine.toCharArray();
        List<Character> magazineList = new ArrayList<>();
        for (char c : magazineArr) {
            magazineList.add(c);
        }

        char[] ransomNoteArr = ransomNote.toCharArray();
        for (char c : ransomNoteArr) {
            if (!magazineList.contains(c)) {
                return false;
            }
            magazineList.remove(Character.valueOf(c));
        }

        return true;
    }
}