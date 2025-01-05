package ex04;

import java.util.Arrays;
import java.util.List;

public class CountApp {
  public static void main(String[] args) {
    // 1. count
    List<String> names = Arrays.asList("Alice","Bob","Charile","David");
/*    int count = 0;
    for(String name: names){
      if(name.length()>3){
        count++;
      }
    }*/
//    names.stream() //물가에 던진다.
//        .filter(name -> name.length() > 3)
//        .toList();
    List<String> r1 = names.stream() //물가에 던진다.
        .filter(name -> name.length() > 3)
        .toList();
    r1.forEach(s -> System.out.println(s));


    long r2 = names.stream() //물가에 던진다.
        .filter(name -> name.length() > 3)
        .count();
    System.out.println(r2);

  }
}
