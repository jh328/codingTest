class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;
    
        s= s.toLowerCase();
        
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'p'){
                count_p++;
            }else if(s.charAt(i) == 'y'){
                count_y++;
            }
        }

        return count_p == count_y;
    }
}