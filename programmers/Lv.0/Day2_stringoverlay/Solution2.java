class Solution2 {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int i = 0 ; i< overwrite_string.length(); i++){
            if(s + i <answer.length()){
                answer.replace(s+i, s+i+1, String.valueOf(overwrite_string.charAt(i)));
            } else {
                answer.append(overwrite_string.charAt(i));
            }
        }
        return answer.toString();
    }
}