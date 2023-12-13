class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수 계산
        int resultGCD = gcd(Math.max(n, m), Math.min(n, m));
        answer[0] = resultGCD;
        
        // 최소공배수 계산
        answer[1] = n * m / resultGCD;
        return answer;
    }

    public int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        return gcd(n, m % n);
    }
}