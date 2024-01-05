import java.util.Scanner;

public class Solution {

    public static boolean isEven(int x) {
            return x % 2 == 0;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEven(n)){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}