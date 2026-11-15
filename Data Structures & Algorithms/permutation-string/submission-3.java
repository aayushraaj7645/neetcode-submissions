
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length(), n = s2.length();

        if (m > n) return false;

        int[] count = new int[26];

        for (int i = 0; i < m; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i <= n - m; i++) {

            boolean match = true;

            for (int j = 0; j < 26; j++) {
                if (count[j] != 0) {
                    match = false;
                    break;
                }
            }

            if (match) return true;

            if (i + m < n) {
                count[s2.charAt(i) - 'a']++;
                count[s2.charAt(i + m) - 'a']--;
            }
        }

        return false;
    }
}
