class Solution {
    public String validIPAddress(String s) {
        String[] ip4 = s.split("\\.", -1);
        String[] ip6 = s.split("\\:", -1);

        if(ip4.length == 4){
            if(ipv4(ip4)) return "IPv4";
        }
        if(ip6.length == 8){
            if(ipv6(ip6)) return "IPv6";
        }
        return "Neither";
    }

    public boolean ipv4(String[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(char ch : arr[i].toCharArray()){
                if(!Character.isDigit(ch)) return false;
            }
            if(arr[i].charAt(0) == '0' && arr[i].length() > 1) return false;
            if(Integer.parseInt(arr[i]) < 0 || Integer.parseInt(arr[i]) > 255) return false;
            

        }
        return true;
    }

    public boolean ipv6(String[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].length() < 1 || arr[i].length() > 4) return false;
            for(char ch : arr[i].toCharArray()){
                boolean digit = Character.isDigit(ch);
                boolean small = (ch >= 'a' && ch <= 'f');
                boolean cap = (ch >= 'A' && ch <= 'F');

                if(!digit && !small && !cap) return false;
            }
            
        }
        return true;
    }
}