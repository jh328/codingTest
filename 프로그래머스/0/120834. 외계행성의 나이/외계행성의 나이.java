class Solution {
    public String solution(int age) {
        String a = String.valueOf(age);
        String answer = "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
          
            int digit = c - '0';
            
            char alphabet = (char)(digit + 'a');
            
            answer += alphabet;
        }
        
        
        return answer;
    }
}