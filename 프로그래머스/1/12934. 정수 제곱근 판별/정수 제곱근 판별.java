class Solution {
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
             // Math.sqrt(n) : 입력 값 n의 제곱근을 계산
             // (int) : 소수점 이하를 제거하여 정수로 변환
             // Math.pow((int)Math.sqrt(n), 2) == n: 정수로 변환한 제곱근을 다시 제곱하여 원래 값 n과 비교하여 n이 어떤 정수의 제곱인지 확인
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
             // n이 정수의 제곱이라면, 그 다음 정수의 제곱을 계산하여 반환
        }
        return -1;
        // n이 정수의 제곱이 아니라면 -1을 반환
    }
}