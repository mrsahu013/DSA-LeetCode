class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        boolean[] seen = new boolean[26];

        for ( int ch = 0; ch < sentence.length(); ch++){
            if (sentence.charAt(ch) >= 'a' && sentence.charAt(ch) <= 'z'){
                seen[sentence.charAt(ch) - 'a'] = true;
            }
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
