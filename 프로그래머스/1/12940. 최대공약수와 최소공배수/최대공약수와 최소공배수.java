class Solution {
    public int[] solution(int n, int m) {
        int gec = getGcd(n, m);
        
        int lmc = (n * m) / gec;
        
        return new int[]{gec,lmc};
    }
    
    public int getGcd(int a, int b){
        while(b != 0){
            int r = a % b;
            
            a = b;
            b = r;
        }
        return a;
    }
}

