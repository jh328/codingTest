import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0];
        
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        
        for (int i = 0; i < arr.length; i++){
            answer.add(arr[i]);
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        answer.remove(Integer.valueOf(min));
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}