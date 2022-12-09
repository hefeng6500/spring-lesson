import com.alibaba.druid.pool.DruidDataSource;
import com.yang.config.JdbcConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
//@ComponentScan("com.yang.config") 这种方式虽然能够扫描到，但是不能很快的知晓都引入了哪些配置类，所有这种方式不推荐使用。
@Import({JdbcConfig.class})
public class SpringConfig {

//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
//        ds.setUsername("root");
//        ds.setPassword("root");
//        return ds;
//    }
}
