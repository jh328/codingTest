class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += (long) price * i; // 3 , 6 , 9 , 12가 나옴 이유는 price의 값은 항상 3이고, i는 1씩 증가해서 1 ,2 , 3 , 4
        }
        if(money >= answer){
            return 0;
        }else{
            return answer - money;
        }
    }
}