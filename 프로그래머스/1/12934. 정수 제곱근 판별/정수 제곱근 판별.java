class Solution {
    public long solution(long n) {
        long sqrtNum = (long) Math.sqrt(n);

        if(sqrtNum * sqrtNum == n){
            return (sqrtNum + 1) * (sqrtNum + 1);
        }
return -1;
    }
}