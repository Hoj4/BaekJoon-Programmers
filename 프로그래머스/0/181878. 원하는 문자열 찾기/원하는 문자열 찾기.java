class Solution {
    public int solution(String myString, String pat) {
        // 소문자로 변환
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        int myStringLength = myString.length();
        int patLength = pat.length();
        
        // myString의 길이가 pat보다 짧은 경우
        if (myStringLength < patLength) {
            return 0;
        }

        // pat과 같은 문자열이 있는지 확인
        for (int i = 0; i <= myStringLength - patLength; i++) {
            String substring = myString.substring(i, i + patLength);
            if (substring.equals(pat)) {
                return 1;
            }
        }
         return 0;
    }
}