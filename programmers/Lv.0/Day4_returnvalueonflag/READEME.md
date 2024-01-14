# [Lv.0] flag에 따라 다른 값 반환하기 - 181933

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181933)

### 성능 요약

메모리: 74.1 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

```
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        return answer;
    }
}
```

### 제한사항

- -1,000 ≤ a, b ≤ 1,000

### 입출력 예 

|a|b|flag|result|
|---|---|---|---|
|-4|7|true|3|
|-4|7|false|-11|

입출력 예 #1

- 예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.

입출력 예 #2

- 예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.
