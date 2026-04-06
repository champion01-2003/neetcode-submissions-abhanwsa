class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // logic is phle use krenge hashmap to store elements, then we will use a priority queue to count the frequency and return the maximum one
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num: nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());
         int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;

        // wev can also solve it using binary seach(lowerbound and upperbound)

    }
}
