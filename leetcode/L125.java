package leetcode;

// 125. Valid Palindrome
public class L125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome1(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        char[] arr = s.toCharArray();

        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toLowerCase().toCharArray();
        while (i <= j) {
            if (!Character.isLetterOrDigit(arr[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[j])) {
                j--;
                continue;
            }
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
