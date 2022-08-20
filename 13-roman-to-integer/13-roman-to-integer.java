class Solution {
    public int romanToInt(String s) {
        int result = 0;
        String[] stringArr = s.split("");

        for (int i = stringArr.length - 1; i >= 0; i--) {
            boolean isException = false;

            if (i != stringArr.length - 1) {
                switch (stringArr[i]) {
                    case "I":
                        if (stringArr[i + 1].equals("V") || stringArr[i + 1].equals("X")) {
                            isException = true;
                            result -= 1;
                        }
                        break;
                    case "X":
                        if (stringArr[i + 1].equals("L") || stringArr[i + 1].equals("C")) {
                            isException = true;
                            result -= 10;
                        }
                        break;
                    case "C":
                        if (stringArr[i + 1].equals("D") || stringArr[i + 1].equals("M")) {
                            isException = true;
                            result -= 100;
                        }
                        break;
                }
            }

            if (!isException) {
                switch (stringArr[i]) {
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