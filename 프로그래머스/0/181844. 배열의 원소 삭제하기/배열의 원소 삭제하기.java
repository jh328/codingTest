import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            boolean shouldDelete = false;
            
            for(int del : delete_list){
                if(num == del){
                    shouldDelete = true;
                    break;
                }
            }
            
            if(!shouldDelete){
                answer.add(num);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}