class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return map.get(a)-map.get(b);
            }
        });
        for(Integer i:map.keySet()){
            pq.add(i);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        int res[] =new int[k];
        for(int i=0;i<k;i++ ){
            res[i]=pq.remove();
        }

return res;
    }
}