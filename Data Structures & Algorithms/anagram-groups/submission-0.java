class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();

        // if(strs.length ==0){
        //     return result;
        // }

        // if(strs.length== 1){
        //     list.add(strs[0]);
        //     result.add(list);
        //     return result;
        // }
        HashMap<String,List<String>> map = new HashMap<>();
        for( String s: strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());




        
    }
}
