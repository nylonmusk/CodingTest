package Programmers_Lv1;
//두 정수 사이의 합
//문제 설명
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//제한 조건
//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.
//입출력 예
//a	b	return
//3	5	12
//3	3	3
//5	3	12


public class Lv1_14 {
	public static void main(String[] args) {
		long l = solution_(5, 10);
		System.out.println(l);
	}
	public static long solution_(int a, int b) {
        long answer = 0;
        if(a<b) {
        	for(int i = a; i<=b; i++) {
        		answer+=i;
        	}
        }else {
        	for(int i = b; i<=a; i++) {
        		answer+=i;
        	}
        }
        
		return answer;
        
    }
}

// 다시풀자  틀림 
//class Solution14 {
//    public long solution(int a, int b) {
//        long answer = 0;
//        if(a<b) {
//        	for(int i = a+1; i <= b; i++) {
//        		a=(a+i);
//        		answer=a;
//        	}
//        }else if(b>a) {
//        	for(int i = b; i <= a; i++) {
//        		b++;
//        		answer=b;
//        	}
//        }else {
//        	answer=b;
//        }
//        return answer;
//    }
//}

//class Solution14_ {
//    public long solution_(int a, int b) {
//        long answer = 0;
//        int l = 0;
//        boolean x = (a==b) ? true : false;
//        if(x==true) {
//        	answer=a;
//        }else if(x==false) {
//        	if((b-a)%2==0 | (a-b)%2==0) {
//        		
//        	}
//        }
//        return answer;
//    }
//}