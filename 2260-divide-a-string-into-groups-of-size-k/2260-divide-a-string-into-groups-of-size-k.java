class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int numGroups = (n + k - 1) / k; // Ceiling division
        String[] result = new String[numGroups];
        
        for (int i = 0, idx = 0; i < n; i += k, idx++) {
            int end = Math.min(i + k, n);
            String group = s.substring(i, end);
            if (group.length() < k) {
                group += String.valueOf(fill).repeat(k - group.length());
            }
            result[idx] = group;
        }
        return result;
    }
}
