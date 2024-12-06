class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int p = denom1 * denom2;
        int c = numer1 * denom2 + numer2 * denom1;
        int max = 0;
        
        for(int i =1; i<=p && i <= c; i++){
            if(p % i == 0 && c % i == 0){
                max = i;
            }
        }
        
        int [] answer = {c/max, p/max};
            
        return answer;
    }
}