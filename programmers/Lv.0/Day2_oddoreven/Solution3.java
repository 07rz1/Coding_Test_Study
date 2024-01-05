import java.util.Scanner;

public class Solution3 {
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " is even"); // if문에 바로 조건 추가
        } else {
            System.out.println(n + " is odd");
        }
    }
}