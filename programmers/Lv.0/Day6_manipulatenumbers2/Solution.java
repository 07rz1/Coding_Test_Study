public class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int n = numLog[0];
        
        for (int i = 1; i < numLog.length; i++) {
            int dis = numLog[i] - numLog[i - 1];

            if (dis == 1) {
                answer.append("w");
                n += 1;
            } else if (dis == -1) {
                answer.append("s");
                n -= 1;
            } else if (dis == 10) {
                answer.append("d");
                n += 10;                
            } else if (dis == -10) {
                answer.append("a");
                n -= 10;
            }
        }
        return answer.toString();
    }
}