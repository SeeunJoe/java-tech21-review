package ex02;

// 입력을 받아서 결과를 반환 - 매개변수T와 return R 모두 존재
public interface MyFunction<T,R> {
  R apply(T t);
}
