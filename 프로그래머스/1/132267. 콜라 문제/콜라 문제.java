class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int Bottles = n;
        
        while (Bottles >= a) {
            int exchanges = Bottles / a * b;
            answer += exchanges;
            
            Bottles = exchanges + (Bottles % a);
        }
        
        return answer;
    }
}