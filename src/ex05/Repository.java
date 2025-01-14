package ex05;

import java.util.Arrays;
import java.util.List;

public class Repository {
    public List<Integer> findAll() {
        return Arrays.asList(1,2,3,4,5);
    }

    public int findByID() {
        /**
         * 조회하다가 오류 [1.숫자를 리턴 -1을 받으면 오류]
         **/

        return -1;
    }
}
