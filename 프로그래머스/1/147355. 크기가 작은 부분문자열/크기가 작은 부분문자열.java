class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pNum = p.length();
        long pLong = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - pNum; i++){
            String sub = t.substring(i, i + pNum);
            
            long subValue = Long.parseLong(sub);
            
            if(subValue <= pLong){
                answer++;
            }
        }
        return answer;
    }
}