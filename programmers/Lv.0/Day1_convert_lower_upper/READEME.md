# [Lv.0] 대소문자 바꿔서 출력하기 - 181949

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181949) 

### 성능 요약

메모리: 67.1 MB, 시간: 231.87 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

<p>영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.</p>

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    }
}
```

### 제한사항

1 ≤ str의 길이 ≤ 20

str은 알파벳으로 이루어진 문자열입니다.

### 입출력 예 

입력 #1
```
aBcDeFg
```

출력 #1
```
AbCdEfG
```