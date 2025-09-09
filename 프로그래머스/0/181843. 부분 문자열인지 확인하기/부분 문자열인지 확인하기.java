class Solution {
    public int solution(String my_string, String target) {
        boolean num = my_string.contains(target);
        if(num){
            return 1;
        }else{
            return 0;
        }
    }
}