package ex03;

// 옵셔널 : null 처리

import java.util.Optional;

public class App {
  public static void main(String[] args) {
    String data1 = null;
    Optional<String> op1 = Optional.ofNullable(data1);
    // null이라 실행 안됨
    if(op1.isPresent()) {
      String r1 = op1.get();
      System.out.println("r1 : " + r1);
    }

    String data2 = null; //runtime 시에 null인지 아닌지 결정
//    String r2 = Optional.ofNullable(data2).get(); //null이라 null point excetion 터짐
//    String r2 = Optional.ofNullable(data2).orElseGet(() -> "대체값");
//    String r2 = Optional.ofNullable(data2).orElse("대체값");
    String r2 = Optional.ofNullable(data2).orElseGet(()->"없어");
    System.out.println("r2 : " + r2);

    String data3 = null;
    String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("값이 없는뎅...조심해 너"));
    System.out.println("r3 : " + r3);



//    Optional<String> op2 = Optional.ofNullable(data2);

  }
}
