class Solution {
    public int solution(int[] num_list) {
        int number = 0; // 몇번 연산을 했는지 확인을 하는 변수
        int divide = 0; // 나누기 한 값 
        for(int num : num_list){
            
            while(num != 1){ // while 반복문에서 num의 값이 0이 될 때 까지 반복
                
                if(num % 2 == 0){ // 짝수면 반으로 나누기
                    num = num / 2;
                }else{ // 홀수면 값을 1을 빼고 나누기
                   num =  (num - 1) / 2;
                }
                number++;
            }
        }
        return number;
    }
}