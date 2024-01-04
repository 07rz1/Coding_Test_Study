# [Lv.0] 덧셈식 출력하기 - 181947

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181947) 

### 성능 요약

메모리: 67.1 MB, 시간: 231.87 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

<p>두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.</p>

```
a + b = c
```

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
```

### 제한사항

- 1 ≤ a, b ≤ 100

### 입출력 예 

입력 #1
```
4 5
```

출력 #1
```
4 + 5 = 9
```