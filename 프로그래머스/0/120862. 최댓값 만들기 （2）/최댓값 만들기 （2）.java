class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int current = numbers[i] * numbers[j];
                
                if(current > max){
                    max = current;
                }
            }
        }
        
        return max;
    }
}