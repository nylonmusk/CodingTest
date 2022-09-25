package Programmers_Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//제일 작은 수 제거하기
//문제 설명
//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//제한 조건
//arr은 길이 1 이상인 배열입니다.
//인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
//입출력 예
//arr	return
//[4,3,2,1]	[4,3,2]
//[10]	[-1]
public class Lv1_18 {

}

//틀
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
        Math.min
    }
}


// 다른사람코드 풀이 세개 모두 중요한듯 
class Solution_ {
    public int[] solution(int[] arr) {        
    if(arr.length == 1) return new int[] {-1};

    // 순서대로 탐색하며 가장 작은 수 찾기
    int min = Integer.MAX_VALUE;
    for(int a : arr) {
        if(min > a) min = a;
    }

    // 위에서 찾은 가장 작은 수를 제외하고 새로운 배열 만들기
    int[] newArr = new int[arr.length-1];
    int index = 0;
        // 이해가 안가는부분
        // 위 향상된 for문에서 int a를 선언하고 나오면 a를 사용할수 없음
        // 밑 for문에서 min!=a에서 a는 무엇을뜻하는지
    for(int a : arr) {
        if(min != a) newArr[index++] = a;
    }

    return newArr;
}


public int[] solution__(int[] arr) {
    if(arr.length <= 1) return new int[] {-1};

    // 배열을 리스트로 변환하면서 가장 작은 수 찾기
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++) {
        list.add(arr[i]);
        if(min > arr[i]) min = arr[i];
    }

    // 가장 작은 수 제거 후 리스트를 새로운 배열로 변환
    list.remove(list.indexOf(min));
    int[] newArr = new int[list.size()];
    for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);

    return newArr;
}

public int[] solution___(int[] arr) {        
    if(arr.length == 1) return new int[] {-1};

    int min = IntStream.of(arr).min().getAsInt();
    return IntStream.of(arr).filter(i -> i != min).toArray();
}
}