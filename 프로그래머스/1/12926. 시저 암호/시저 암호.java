class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                answer += " ";
            }else if(Character.isLowerCase(c)){
                char p = (char) (c + n);
                if(p > 'z'){
                    p -= 26;
                }
                answer += p;
            }else if(Character.isUpperCase(c)){
                char p = (char) (c + n);
                if(p >'Z'){
                    p -= 26;
                }
                answer += p;
            }
        }
        return answer;
    }
}