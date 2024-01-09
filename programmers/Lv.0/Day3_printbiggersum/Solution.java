class Solution {
    public int solution(int a, int b) {
        String result = (String.valueOf(a)+String.valueOf(b)).compareTo(String.valueOf(b)+String.valueOf(a))>=0 ? String.valueOf(a)+String.valueOf(b) : String.valueOf(b)+String.valueOf(a);
        System.out.println(result);
        
        return Integer.parseInt(result);
    }
}