import com.yang.config.SpringConfig;
import com.yang.dao.BookDao;
import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
//        bookDao.update();
        System.out.println(bookDao.getClass()); // 被增强的代理对象

        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = ctx1.getBean(UserDao.class);
        System.out.println(userDao.getClass()); // 普通的目标对象，没有被增强
    }
}
