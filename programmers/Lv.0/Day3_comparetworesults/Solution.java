class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt("" + a+b);
        int multiplyab = 2*a*b;
        answer = ab>= multiplyab ? ab : multiplyab;
                
        return answer;
    }
}