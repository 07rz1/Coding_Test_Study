class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        for(int num : num_list){
            sum += num;
        }

        int product = 1;
        for(int num : num_list){
            product *= num;
        }

        return product < sum*sum ? 1:0;
    }
}