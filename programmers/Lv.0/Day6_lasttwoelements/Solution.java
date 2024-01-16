import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length -1];
        int secondLast = num_list[num_list.length -2];
        int[] answer;
        ArrayList<Integer> add_number = new ArrayList<>(Arrays.asList(Arrays.stream(num_list).boxed().toArray(Integer[]::new)));
        if(last>secondLast){
            add_number.add(last - secondLast);
        } else{
            add_number.add(last * 2);
        }

        answer = add_number.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}