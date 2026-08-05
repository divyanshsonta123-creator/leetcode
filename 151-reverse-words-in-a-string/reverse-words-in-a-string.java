class Solution {
    public String reverseWords(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        // Split the string into words
        String[] words = s.split("\\s+");

        // Store the reversed sentence
        StringBuilder ans = new StringBuilder();

        // Traverse from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {

            // Add the current word
            ans.append(words[i]);

            // Add a space after every word except the last one
            if (i != 0) {
                ans.append(" ");
            }
        }

        // Convert StringBuilder to String
        return ans.toString();
    }
}