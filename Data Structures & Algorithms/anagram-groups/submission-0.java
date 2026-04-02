class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map to store: SortedString -> List of Anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Convert to char array and sort
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            
            // 2. If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // 3. Add the original string to the list
            map.get(key).add(s);
        }
        
        // 4. Return all grouped lists
        return new ArrayList<>(map.values());
    }
}
