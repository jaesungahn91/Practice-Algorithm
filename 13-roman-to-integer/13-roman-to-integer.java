class Solution {
    public int romanToInt(String s) {
        int result = 0;
        String[] chars = s.split("");

        for (int i = chars.length - 1; i >= 0; i--) {
            boolean isException = false;

            if (i != chars.length - 1) {
                switch (chars[i]) {
                    case "I":
                        if (chars[i + 1].equals("V") || chars[i + 1].equals("X")) {
                            isException = true;
                            result -= 1;
                        }
                        break;
                    case "X":
                        if (chars[i + 1].equals("L") || chars[i + 1].equals("C")) {
                            isException = true;
                            result -= 10;
                        }
                        break;
                    case "C":
                        if (chars[i + 1].equals("D") || chars[i + 1].equals("M")) {
                            isException = true;
                            result -= 100;
                        }
                        break;
                }
            }

            if (!isException) {
                switch (chars[i]) {
                    case "I":
                        result += 1;
                        break;
                    case "V":
                        result += 5;
                        break;
                    case "X":
                        result += 10;
                        break;
                    case "L":
                        result += 50;
                        break;
                    case "C":
                        result += 100;
                        break;
                    case "D":
                        result += 500;
                        break;
                    case "M":
                        result += 1000;
                        break;
                }
            }
        }
        
        return result;
    }
}