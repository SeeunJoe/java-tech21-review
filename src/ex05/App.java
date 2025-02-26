package ex05;

public class App {
    public static void main(String[] args) {

        // new로 메모리에 띄우기 의존관계 순서로 띄워야한다.
        Repository repository = new Repository();
        Service service = new Service(repository);
        Controller con = new Controller(service);
        ControllerAdvice controllerAdvice = new ControllerAdvice();
        DispatcherServlet ds = new DispatcherServlet(con,controllerAdvice);

        ds.route("/board"); // spring에서는 tomcat이 이 루트를 때리면 dispatcherServlet을 때리고 controller로 넘어간다.

    }
}

