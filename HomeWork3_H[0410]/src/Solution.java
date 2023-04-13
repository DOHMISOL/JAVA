
public class Solution {
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요
	
	public String solution(String s) {
	 StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1); // -1은 빈 문자열도 포함하도록 합니다.

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
            answer.append(" ");
        }
        // 마지막 공백 제거
        answer.setLength(answer.length() - 1);

        return answer.toString();
    }
}
