# [Lv.0] a와 b 출력하기 - 181951

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181951) 

### 성능 요약

메모리: 65.9 MB, 시간: 152.12 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성 : 100.0
합계 : 100.0 / 100.0

### 문제 설명

<p>정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.</p>

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

-100,000 ≤ a, b ≤ 100,000

### 입출력 예 

입력 #1
```
4 5
```

출력 #1
```
a = 4
b = 5
```