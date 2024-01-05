class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i= 0; i<overwrite_string.length(); i++){
            if (s+i < my_string.length()) {
                answer += overwrite_string.charAt(i);
            } else {
                break;
            }
        }

        return my_string.substring(0, s) + answer + my_string.substring(s+overwrite_string.length());
    }
}