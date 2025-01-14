package ex05;

import java.util.List;

public class Controller {

    /**
     *  여기서는 new해서 가져오는 것이 아니라 처음에 initialized한 것을 가져온다. -> new 여러번 하지 않아도 됨
     *  main에서 처음에 띄워는 것 -> spring initialize -> 이 때 뜨는 객체들을 bean이라고 한다.
     */
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void list(){
        List<Integer> models  = service.목록보기();
        for(Integer model : models){
            System.out.println("rendering : "+model);
        }
    }

    public void detail(){
        int model = service.상세보기();
        System.out.println("rendering : "+model);
    }
}
