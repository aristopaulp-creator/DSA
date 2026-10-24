class HighestOccurringElementInAnArray {
    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int large = nums[0];
        int maxFreq = map.get(nums[0]);
        for(int i = 0; i<nums.length; i++){
            int freq = map.get(nums[i]);
            if(freq > maxFreq || (freq == maxFreq && nums[i] < large)){
                maxFreq = freq;
                large = nums[i];
            }
        }

        return large;
    }
}