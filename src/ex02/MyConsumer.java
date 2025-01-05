package ex02;

// 입력만 받고 출력이 없는(void) 연산을 수행한다.
public interface MyConsumer<T> {
  void accept(T data);
}
