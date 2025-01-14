package ex05;

public class DispatcherServlet {

    private final Controller con;

    // 생성자
    public DispatcherServlet(Controller con) {
        this.con  = con;
    }

    public void route(String path){
        if(path.equals("/")){
            con.list();
        }else if(path.equals("/board")) {
            con.detail();
        }else{
            // 여기서 못 찾으면 예외를 터트려야 해
            System.out.println("404 not found");
        }
    }
}
/**
 * try-catch -> 여기 코드에서 제어한다
 * throw를 날린다 -> 나를 호출하는 애한테 위임한다.
 * dispatcherServlet은 main으로 가니까 throw 날리면 걍 터져서 오류남 -> 여기서 throw-catch해서 잡아야해
 */
