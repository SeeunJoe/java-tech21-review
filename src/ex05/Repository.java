package ex05;

import java.util.Arrays;
import java.util.List;

public class Repository {
    /**
     * repository에서는 db와 연결하는 책임만 있기 때문에 여기서 처리하지 않는다.
     *
     * 응답하는 타입이 다르기 때문에 return문으로는 해결하지 못한다
     * -> try-catch -> 오류가 난 곳에서 바로 처리하겠다.
     */
    public List<Integer> findAll() {//throws InterruptedException {

/*        try {
            Thread.sleep(1000); // thread는 쉴틈없이 일함
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        return Arrays.asList(1,2,3,4,5);
    }

    public int findByID() {
        /**
         * 조회하다가 오류 [1.숫자를 리턴 -1을 받으면 오류] -> 안됨 : type이 달라질 수 있다.
         * 오류가 난 곳에서 처리할 수 없다 : 책임이 분리되어 있다. (try-catch(:오류가 난 곳에서 바로 처리하겠다) 사용할 수 없다.)
         * -> 예외를 처리하는 걸 만든다. aop
         **/

/*      현재 안터지기 때문에 try-catch 로 안하고 throw로 그냥 터트린다.
        try {
            return 1;
        }catch (Exception e) {
            throw new RuntimeException("db에서 오류났어"); // 실행 중에 터지는 exception들의 최상위 부모
        }*/

        throw new RuntimeException("db에서 오류났어"); //-> service의 상세보기로 위임한다.
    }
}
