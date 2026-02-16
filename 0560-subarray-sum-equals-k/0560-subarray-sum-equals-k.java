class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int ele = arr[i];
            if(ele == k) cnt++;
            int rem = ele - k;
            if(map.containsKey(rem)) cnt += map.get(rem);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }else{
                map.put(ele, 1);
            }
        }
        return cnt;
    }
}