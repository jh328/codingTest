import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] afterStr = after.toCharArray();
        char[] beforeStr = before.toCharArray();


        Arrays.sort(beforeStr);
        Arrays.sort(afterStr);

        String sortBefore = new String(beforeStr);
        String sortAfter = new String(afterStr);


        return sortBefore.equals(sortAfter) ? 1 : 0;
    }
}