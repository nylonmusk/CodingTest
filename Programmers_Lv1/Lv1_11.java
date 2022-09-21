package Programmers_Lv1;

//x만큼 간격이 있는 n개의 숫자
//문제 설명
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//
//제한 조건
//x는 -10000000 이상, 10000000 이하인 정수입니다.
//n은 1000 이하인 자연수입니다.
//입출력 예
//x	n	answer
//2	5	[2,4,6,8,10]
//4	3	[4,8,12]
//-4	2	[-4, -8]
public class Lv1_11 {

}
// 실행시간이 너무 길어 실패 (질문하기)
class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i<n; i++) {
        	for(int j = x; j<10000000; x+=x) {
        	answer[i] = j;
        	}
        }
        return answer;
    }
}

// 재도전  실행시간이 길어 실패 
class Solution11_ {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i<n; i++) {
        	for(int j = x; j<n; x+=x) {
        	answer[i] = j;
        	}
        }
        return answer;
    }
}

// 재재도전 틀림 
class Solution11__ {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}

// 맞는답 나랑 뭐가 다른지 모르겠음 
class Solution11___ {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}









