package ex02;

// 입력없이 값을 반환(리턴)
@FunctionalInterface
public interface MySupplier<T> {// 뭐 리턴할지 모르니까 <T> 제네릭
  T get();
//  void good(); -> runtime할 때 메소드 2개면 오류가 나야하는데 오류가 난다.
  //-> 현재 안터짐 @FunctionalInterface붙여주면 오류 확인이 가능하다.
}
