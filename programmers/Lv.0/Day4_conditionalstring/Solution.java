class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.contains(">")&&eq.contains("=")){
            return n>=m ? 1:0;
        }
        if(ineq.contains(">")&&eq.contains(("!"))){
            return n>m ? 1:0;
        }
        if(ineq.contains("<")&&eq.contains("=")){
            return n<=m ? 1:0;
        }
        return n<m ? 1:0;
    }
}