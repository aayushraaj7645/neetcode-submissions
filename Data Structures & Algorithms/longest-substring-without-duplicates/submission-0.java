class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i =0;
      int j =0;
      int size =0;
      HashSet<Character> set = new HashSet<>();

      while(j<s.length()){
        char ch = s.charAt(j);
        while(set.contains(ch)){
            set.remove(s.charAt(i));
            i++;
        }

            set.add(ch);
            size = Math.max(size,set.size());
        j++;

      }
      return size;

    }
}
