class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        int[] lastSeen = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            left = Math.max(left, lastSeen[c]);
            maxLength = Math.max(maxLength, right - left + 1);

            lastSeen[c] = right + 1;
        }

        return maxLength;
    }
}