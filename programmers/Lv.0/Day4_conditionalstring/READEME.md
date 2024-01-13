# [Lv.0] 조건 문자열 - 181934

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181934)

### 성능 요약

메모리: 74.1 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

- 두 수가 n과 m이라면
    - ">", "=" : n >= m
    - "<", "=" : n <= m
    - ">", "!" : n > m
    - "<", "!" : n < m

두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
```
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        return answer;
    }
}
```

### 제한사항

- 1 ≤ n, m ≤ 100

### 입출력 예 

|ineq|eq|n|m|result|
|---|---|---|---|---|
|"<"|"="|20|50|1|
|">"|"!"|41|78|0|

입출력 예 #1

- 20 <= 50은 참이기 때문에 1을 return합니다.

입출력 예 #2

- 41 > 78은 거짓이기 때문에 0을 return합니다.
