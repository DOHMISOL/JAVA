package dfsf;

import java.util.Arrays;
import java.util.Scanner;

public class Q1927 {
	public static void main(String[] args) {
//		어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//		예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
//		문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("알파벳을 입력해주세요.");
		
//		String s = "ab";
//		int num = 3;
//		
//		String answer = "";
//		System.out.println(s.length());
//		for(int i=0; i<s.length();i++) {
//			char ab =  (char) (s.charAt(i)+num);
//			answer += ab;
//			System.out.println(answer);
//		}
//		char ch = answer.charAt(answer.length());
//		
//		System.out.println(ch);
		// 대문자 65~90, 소문자 97 ~122
//		
//		char a1 = 65;
//		char aa = 'A';
//		System.out.println(a1);
//		System.out.println(Arrays.toString(a2));
//		
//		String a = "AerTz";
//		String[] aaa = a.split(""); // 문자열 각각 나눠서 문자열배열 만들기 ["a","b","a
//		char[] a2 = a.toCharArray(); // 문자열을 각각 나눠서 캐릭터배열로 만들기 ['a' , 'b']
//		
//		for(int i=0; i<a2.length;i++) {
//			if (a2[i] >= 65 && a2[i] <= 90) { // 대문자일때
//				a2[i] = (char) (a2[i] + 1);
//				if(a2[i] == 32) {
//					a2[i] = 32;
//				}else if(a2[i] <= 65 && a2[i] >= 90) {
//					a2[i] = (char) (a2[i]%90+64);
//			
//				}
//			}else if(a2[i] >= 97 && a2[i] <= 122) { //소문자일때
//				a2[i] = (char) (a2[i] + 1);
//				if(a2[i] == 32) {
//					a2[i] = 32;
//				}else if(a2[i] <= 97 && a2[i] >= 122) {
//					a2[i] = (char) ((a2[i]%122)+96);
//					
//				}
//			}
//		}
//		System.out.println(a2);
//		
//		//특수문자일때
//		//공백일떄
//			
//			
//			
//		String answer = "";
//		for (int i = 0; i < a2.length; i++) { 
//			a2[i] = (char) (a2[i] + 1);
//			 
//		}
//		System.out.println(Arrays.toString(a2));
//		System.out.println(answer);
//		
//		String [] alphabet1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
////		String [] alphabet2
//		char[] arr = {'a','b',};
//		if (Character.isLowerCase(arr[0])) {
//			System.out.println("소문자");
//		}
//		String answer="";
//		int num = 3;
//		
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("단어를 입력해주세요");
//		String inputString = scanner.nextLine();
//		
//		String splitWord[] = inputString.split("");
		//대문자면 
		//소문자면
		
//			for(int i=0; i<alphabet.length;i++) {
//				for(int j=0; j<inputString.length();j++) {
//					if(alphabet[i].equals(splitWord[j])) {
//						if(i>j) {
//							answer = answer + alphabet[i+num];
//						}else if(i<j) {
//							answer = answer + alphabet[j-(alphabet.length)];
//						}
//					}
//					
//				}
//			}
//		System.out.println(answer);
		
		int s = "ADgvz";
		
		String result = "";
		char [] c = s.toCharArray();
		
		for(int i =0; i<c.length;i++) {
			if(c[i] == 32) {
				c[i] = (char)(c[i]);
			}else if(c[i]>=65 && c[i]<=90 && c[i]+n > 90) {
				c[i] = (char)(c[i]+n-26);
			}else if(c[i]>=97 && c[i]<=122 && c[i]+n > 122) {
				c[i] = (char)(c[i]+n-26);
			}else {
				c[i] = (char)(c[i]+n)
			}
		}
		result = String.valueOf(c);
		return result;
	}
}
