// 해당 문제는 반복문을 활용을 해서,
// 매개변수 배열의 인덱스에서 홀수와 정수를 찾은 다음 값을 합산을 해서 반환을 하면 되는 문제
// 
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String even = "";
        String odd = "";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        
        answer += Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}