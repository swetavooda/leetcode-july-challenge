//problem link: https://leetcode.com/problems/top-k-frequent-elements/
//priority queue(heap)

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int[] result = new int[k];
        
        for (int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        
        Queue<Integer> PQ = new PriorityQueue<>((a, b) -> hmap.get(b) - hmap.get(a));
        for(int x: hmap.keySet()){
            PQ.add(x);
        }
        
        for(int i = 0; i < k; ++i)
            result[i] = PQ.poll();
        return result;
    }
    
}