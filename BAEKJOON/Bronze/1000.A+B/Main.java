import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("A와 B 값을 입력하세요. 값은 공백으로 구분해주세요.");
	int A = sc.nextInt();
	int B = sc.nextInt();
	if (A <= 0) {
		System.out.println("Error: A는 0보다 커야합니다.");
		} else if (B >= 10) {
		System.out.println("Error: B는 10보다 작아야합니다.");
		} else {
		int answer = A+B;
		System.out.println(answer);
		}
	}
}