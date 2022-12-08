import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 在配置类上添加`@Configuration`注解，将其标识为一个配置类,替换`applicationContext.xml`
// 在配置类上添加包扫描注解`@ComponentScan`替换`<context:component-scan base-package=""/>`
@Configuration
@ComponentScan("com.yang")
public class SpringConfig {
}
