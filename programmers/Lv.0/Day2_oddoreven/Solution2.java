import java.util.Scanner;

public class Solution2 {

    public static boolean isEven(int x) {
            return x % 2 == 0;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n + " is " +(n % 2 == 0 ? "even" : "odd")); // 삼항연산자 사용
    }
}