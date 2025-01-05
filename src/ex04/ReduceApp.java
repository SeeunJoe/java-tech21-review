package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
  public static void main(String[] args) {
    // 1. reduce (조인)
    List<Integer> nums = Arrays.asList(1,2,3,4);

    int sum = nums.stream()
        .mapToInt(x -> x) // sum을 위한 중간연산을 안 할 수 없어서 적는 거 큰 의미는 없다.
        .sum();

    System.out.println(sum);

    int sum2 = nums.stream()
        .reduce(5,(prev,next) -> prev + next);

    int sum3 = nums.stream()
        .reduce(5,(prev,next) -> {  // 5는 시작값 넣어줘
          System.out.println("prev :" +prev);
          System.out.println("next :" +next);
          System.out.println("=================");
          return prev + next;
        });
    System.out.println(sum3);

  }
}
