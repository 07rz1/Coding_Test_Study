class Solution {
    public int solution(int n) {
        if(n%2==0)
        {
            return 4*(n/2*(n/2+1)*(n+1))/6;
        } else
        {
            return ((n+1)/2)*((n+1)/2);
        }
    }
}