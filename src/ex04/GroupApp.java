package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupApp {
  public static void main(String[] args) {
    // 1. group
    List<String> names = Arrays.asList("Alice","Bob","Charile","David","Anna");

    //Map<Character,List<String>>
    var groupData = names.stream()
        .map(s -> s.toUpperCase())
        .collect(Collectors.groupingBy(s -> s.charAt(0))); //첫 알파벳 기준으로 그룹핑

    System.out.println(groupData);
    System.out.println(groupData.get('A'));
  }
}
