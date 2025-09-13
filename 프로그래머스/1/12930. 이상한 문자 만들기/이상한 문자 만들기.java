class Solution {
    public String solution(String s) {
        String answer = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println(" c = " + c);
           if(c == ' '){
               num = 0;
               answer += c;
           }else{
               if(num % 2 == 0){
                   answer += Character.toUpperCase(c);
               }else {
                   answer += Character.toLowerCase(c);
               }
               num++;
           }
        }
        System.out.println("adsf = "+ answer);
        return answer;
    }
}