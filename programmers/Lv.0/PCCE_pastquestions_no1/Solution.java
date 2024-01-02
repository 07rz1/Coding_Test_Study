public class Solution {
    public static void main(String[] args) {
        String msg = "Spring is beginning";
        int val1 = msg.split(" ").length; //공백 기준 단어 개수
        String val2 = String.valueOf(val1);

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
