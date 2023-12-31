class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        
        free = k-n/10;
        answer = n*12000 + free*2000;
    
        return answer;
    }
}