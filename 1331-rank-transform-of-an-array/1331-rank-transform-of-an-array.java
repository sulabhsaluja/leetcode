class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int rank = 1;
        for (int num : sorted) {
            if (!map.containsKey(num)) map.put(num, rank++);
        }
        
        for(int i = 0 ; i < n ; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}