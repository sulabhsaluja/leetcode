class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
        // for(int i = 1 ; i <= n ; i++){
        //     arr[i - 1] += bookings[i][2];
        // }
        for(int[] booking : bookings){
            int firstFlight = booking[0];
            int lastFlight = booking[1];
            int seats = booking[2];

            for(int i = firstFlight - 1 ; i <= lastFlight - 1 ; i++){
                arr[i]+=seats;
            }
        }

        return arr;
    }
}