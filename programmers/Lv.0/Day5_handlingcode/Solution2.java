class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i<code.length(); i++){
            char current = code.charAt(i);
            if(current == '1'){
                mode = mode == 0 ? 1:0;
                continue;
            }
            if(i%2 == mode){            //mode = 0 일 때 짝수인덱스 mode = 1 일 때 홀수 인덱스 추가 성질 활용
                answer.append(current);
            }
        }
        return answer.length() > 0 ? answer.toString() : "EMPTY" ;
    }
}