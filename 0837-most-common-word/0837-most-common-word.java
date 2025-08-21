class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Normalize the paragraph
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Create set for banned words
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // Split words and count frequencies
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : paragraph.split("\\s+")) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Find the most frequent word
        String result = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
