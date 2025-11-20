class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int p1 = -1; 
        int p2 = -1; 
        int count = 0;

        for (int[] it : intervals) {
            int l = it[0], r = it[1];

            boolean hasP1 = (p1 >= l);
            boolean hasP2 = (p2 >= l);

            if (hasP1 && hasP2) {
                continue;  
            }

            if (hasP1) {
                count += 1;
                p2 = p1;
                p1 = r;  
            } else {
                count += 2;
                p2 = r - 1;
                p1 = r;
            }
        }

        return count;
    }
}
