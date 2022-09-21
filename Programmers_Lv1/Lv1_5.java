package Programmers_Lv1;
import java.util.*;

//자릿수 더하기
//문제 설명
//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
//
//제한사항
//N의 범위 : 100,000,000 이하의 자연수
//입출력 예
//N	answer
//123	6
//987	24
//입출력 예 설명
//입출력 예 #1
//문제의 예시와 같습니다.
//
//입출력 예 #2
//9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.

// 틀린문제 다시풀것!

public class Lv1_5 {


//	public class Solution {
//	    public int solution(int n) {
//	        int answer = 0;
//	    while(n>0){
//	        answer+=n%10;
//	        n=n/10;
//	    }
//	        return answer;
//	    }
//	}
	
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String s = Integer.toString(n); //int n을 String으로 변환
	        
	        for(int i=0; i<s.length(); i++){
	            answer += Integer.parseInt(s.substring(i, i+1));
	        }
	        return answer;
	    }
	}
}	
	
	
