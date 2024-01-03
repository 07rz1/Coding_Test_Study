# [Lv.0] 문자열 반복해서 출력하기 - 181950

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181950) 

### 성능 요약

메모리: 71.3 MB, 시간: 181.51 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

<p>문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.</p>

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
    }
}
```

### 제한사항

1 ≤ str의 길이 ≤ 10

1 ≤ n ≤ 5

### 입출력 예 

입력 #1
```
string 5
```

출력 #1
```
stringstringstringstringstring
```