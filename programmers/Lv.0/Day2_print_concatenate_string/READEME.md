# [Lv.0] 문자열 붙여서 출력하기 - 181946

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181946) 

### 성능 요약

메모리: 66 MB, 시간: 173.19 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

<p>두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.</p>
<p>입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.</p>

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
    }
}
```

### 제한사항

- 1 ≤ str1, str2의 길이 ≤ 10

### 입출력 예 

입력 #1
```
apple pen
```

출력 #1
```
applepen
```