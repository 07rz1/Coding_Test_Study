public class Solution {
    public static int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            n += ch == 'w' ? 1 : ch == 's' ? -1 : ch == 'd' ? 10 : -10;
        }
        return n;
    }
}
