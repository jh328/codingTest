class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int sum = 0; 
        
        for(int i = 0; i < num_list.length; i++){
            // 원소의 곱 구하기
            multiply *= num_list[i];
            
            // 원소의 합
            sum += num_list[i];
        }
        
        int summation = sum * sum;
        
        return (multiply < summation) ? 1 : 0;
    }
}