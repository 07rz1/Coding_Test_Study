public class Solution {
    public static void main(String[] args) {
        int n = 5;
        String control = "wasd";
        int result = solution(n, control);
        System.out.println(result);
    }

    public static int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            switch (ch) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
