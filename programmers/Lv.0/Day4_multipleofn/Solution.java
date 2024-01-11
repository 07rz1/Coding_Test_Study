class Solution {
    public int solution(int num, int n) {      
        int answer = 0;
        int remain = num % n;
        answer = (remain == 0) ? 1:0;

        return answer;
    }
}