package ex02;

// 1. 람다는 인터페이스로 만든다.
// 2. 인터페이스에는 메서드가 하나만 존재해야 한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있으면 행위를 줘라라는 뜻
// 4. 람다에서는 매개변수에 타입을 생략 가능하다.
// 5. @FunctionalInterface 표시가능!

public class App {
  public static void main(String[] args) {
    MyConsumer<Integer> r1 = (Integer data) -> {  // ()-> {}으로 해도 된다.
      System.out.println("소비할 데이터 : "+data);
    };
    r1.accept(1);

//    MySupplier<String> r2 = () -> {return "good";}; // 오류의 이유 : 람다는 return값이 항상 존재해야한다.
    MySupplier<String> r3 = () -> "good"; // 람다 표현식
    String msg  =r3.get();
    System.out.println(msg);

    MyFunction<Integer,String> r4 = (Integer data4) -> "gg";
    r4.apply(1);
  }
}

