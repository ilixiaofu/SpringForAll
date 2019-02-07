package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webapp.anno.UserService;

public class TestAnno {
    @Test
    public void testanno() { // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);
        userService.add();
    }
}
