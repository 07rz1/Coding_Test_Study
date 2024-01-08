import java.util.Scanner;

class Solution {
    public String solution(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        String[] testArray = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            testArray[i] = sc.nextLine();
        }
        Solution solutionInstance = new Solution();
        String result = solutionInstance.solution(testArray);
        System.out.println(result);
    }

}