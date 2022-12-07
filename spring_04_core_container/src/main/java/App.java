import com.yang.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        推荐使用
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

// 不推荐使用，当项目的位置发生变化后,代码也需要跟着改,耦合度较高,不推荐使用。
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\java-workplace\\spring-lesson\\spring_04_core_container\\src\\main\\resources\\applicationContext.xml");


//        Bean的三种获取方式
//        1.
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

//        2.
//        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);

//        3. 前提必须保证 ioc 容器中只有一个 BookDao 对应的 bean 对象
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
