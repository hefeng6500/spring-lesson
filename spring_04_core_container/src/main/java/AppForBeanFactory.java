import com.yang.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
//        BeanFactory是延迟加载，只有在获取bean对象的时候才会去创建
//        Resource resources = new ClassPathResource("applicationContext.xml");
//        BeanFactory bf = new XmlBeanFactory(resources);
//        BookDao bookDao = bf.getBean(BookDao.class);
//        bookDao.save();

//        ApplicationContext是立即加载，容器加载的时候就会创建bean对象，bean 配置 添加 lazy-init="true" 也可以延迟加载
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
    }
}
