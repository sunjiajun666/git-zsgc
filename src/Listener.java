import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("创建成功");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("销毁成功");
    }
}
