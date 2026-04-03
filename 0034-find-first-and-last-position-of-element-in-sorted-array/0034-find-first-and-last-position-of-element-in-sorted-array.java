class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOc(nums, target), lastOc(nums, target)};
    }

    int firstOc(int[] a, int t) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        int idx = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] == t){
                idx = mid;
                end = mid - 1;
            }
            else if(a[mid] > t) end = mid - 1;
            else start = mid + 1;
        }
        return idx;
    }

    int lastOc(int[] a, int t) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        int idx = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(a[mid] == t){
                idx = mid;
                start = mid + 1;
            }
            else if(a[mid] > t) end = mid - 1;
            else start = mid + 1;
        }
        return idx;
    }
}