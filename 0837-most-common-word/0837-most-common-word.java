class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // if(banned.length == 0) return paragraph;
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> bannedWords = new HashSet<>();
        for(String ban : banned){
            bannedWords.add(ban.toLowerCase());
        }

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = paragraph.split("\\s+");
        for(int i = 0 ; i < words.length ; i++){
            String curr = words[i];
            if(bannedWords.contains(curr)) continue;

            else if(map.containsKey(curr)){
                int currVal = map.get(curr);
                map.put(curr, currVal + 1);
            }

            else map.put(curr, 1);
        }


         String result = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;

    }
}