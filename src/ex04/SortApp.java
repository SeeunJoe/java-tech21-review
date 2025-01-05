package ex04;

import java.util.Arrays;
import java.util.List;

public class SortApp {
  public static void main(String[] args) {
    // 1.sort
    List<Integer> nums = Arrays.asList(5,4,1,4,2,5);

    nums.stream()
        .sorted() // 모든 알고리즘의 시작 정렬!!!! -> 그냥 sort는 오름차순 정렬
        .distinct() // 중복제거
        .forEach(a -> System.out.print(a));
  }
}
