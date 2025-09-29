class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder result = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char leftChar = result.charAt(start);
            char rightChar = result.charAt(end);

            if (!Character.isLetter(leftChar)) {
                start++;
            } else if (!Character.isLetter(rightChar)) {
                end--;
            } else {
                result.setCharAt(start, rightChar);
                result.setCharAt(end, leftChar);
                start++;
                end--;
            }
        }
        return result.toString();
    }
}
