class Solution {
    public List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int index = 0;
        subset(index ,nums ,new  ArrayList<>());
        return list;
    }
    public void subset(int index ,int[] nums , ArrayList<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
        temp.add(nums[i]);
        subset(i+1,nums,temp);
        temp.remove(temp.size()-1);
        }
    }
}