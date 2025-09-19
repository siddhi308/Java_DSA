class Solution {
    public int maxDepth(String s) {
        int count_open = 0;  // Current depth
        int max = 0;         // Maximum depth found

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count_open++;  // Increase depth
                if (count_open > max) {
                    max = count_open;  // Update max depth
                }
            } else if (s.charAt(i) == ')') {
                count_open--;  // Decrease depth
            }
        }
        return max;
    }
}