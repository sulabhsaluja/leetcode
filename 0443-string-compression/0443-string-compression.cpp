// class Solution {
// public:
//     int compress(vector<char>& chars) {
        
//         int n = chars.size();
//         int var_count = 1;
//         for(int i = 0 ; i < n-1 ; i++){
//             if(chars[i] != chars[i+1]){
//                 var_count++;
//             }
//         }
//         return var_count * 2;
//     }
// };


class Solution {
public:
    int compress(vector<char>& chars) {
        int write = 0;   // Position to write compressed characters
        int count = 1;   // Count of consecutive characters
        
        for (int i = 0; i < chars.size(); i++) {
            // Check if the current character is different from the next one
            if (i + 1 == chars.size() || chars[i] != chars[i + 1]) {
                // Write the current character
                chars[write++] = chars[i];
                
                // If count > 1, write its digits
                if (count > 1) {
                    string cnt = to_string(count);
                    for (char c : cnt) {
                        chars[write++] = c;
                    }
                }
                
                // Reset the count for the next group
                count = 1;
            } 
            else {
                // Increment count for consecutive characters
                count++;
            }
        }
        
        // Return the length of the compressed array
        return write;
    }
};
