package ex05;

public class DispatcherServlet {

    private final Controller con;
    private final ControllerAdvice controllerAdvice;

    // 생성자
    public DispatcherServlet(Controller con, ControllerAdvice controllerAdvice) {
        this.con  = con;
        this.controllerAdvice = controllerAdvice;
    }

    public void route(String path){

        try{
            if(path.equals("/")){
                con.list();
            }else if(path.equals("/board")) {
                con.detail();
            }else{
                // 여기서 못 찾으면 예외를 터트려야 해
                System.out.println("404 not found");
            }
        }catch (RuntimeException e){
            // 0. 컴퍼넌스 스캔과 인보크는 java의 reflection으로 프로세스를 때릴 때 발생한다.
            // 1. 컴퍼넌트 스캔 @ControllerAdvice
            // 2. invoke(호출): 맞는 매개변수 타입을 찾아 때려준다.
            //  -> 여기에서는 RuntimeException이므로 RuntimeException 매개변수를 가진 친구를 찾아서 때린다.
            controllerAdvice.process(e);

            /**
             * throw로 날려주고
             * @ControllerAdvice 붙인 클래스에 예외처리 해주면 끝
             */

        }
    }
}
/**
 * try-catch -> 여기 코드에서 제어한다
 * throw를 날린다 -> 나를 호출하는 애한테 위임한다.
 * dispatcherServlet은 main으로 가니까 throw 날리면 걍 터져서 오류남 -> 여기서 throw-catch해서 잡아야해
 */
