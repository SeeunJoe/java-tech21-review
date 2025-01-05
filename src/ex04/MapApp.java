package ex04;

import java.util.Arrays;
import java.util.List;

public class MapApp {
  public static void main(String[] args) {
    // 1. map (가공)
    List<String> names = Arrays.asList("Alice","Bob","Charile","David");

    //원래였으면 빈 List만들어서 하나씩 돌면서 소문자로 바꿔서 List에 저장해야한다
    List<String> newNames = names.stream()
        .map(name-> name.toLowerCase())
        .toList();
    newNames.forEach(System.out::println);
    newNames.forEach(name -> System.out.println(name));
  }
}
