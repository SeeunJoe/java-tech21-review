package ex05;

import java.util.List;

public class Service {

    /**
     * has - composition 필요한 것 - (패티,빵, 야채 -컴포지션)로 만들어진 치즈버거는 상속
     * is - 상속 - 치즈버거는 버거다
     */

    // 필드선언 부터 생성자까지 composition이다. - 필요함
    private final Repository repo;

    public Service(Repository repo) {
        this.repo = repo;
    }

    public List<Integer> 목록보기() {
        return repo.findAll();
    }

    public int 상세보기() {
        return repo.findByID();
    }
}
