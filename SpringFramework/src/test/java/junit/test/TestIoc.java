package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webapp.ioc.User;
import com.webapp.ioc.bean1;
import com.webapp.ioc.bean2;
import com.webapp.property.Person;
import com.webapp.property.PropertyDemo1;
import com.webapp.property.UserService;

public class TestIoc {

    @Test
    public void testUer() { // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("./bean1.xml");

        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
    }

    @Test
    public void testService2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        bean1 bean = (bean1) context.getBean("bean1");
        System.out.println(bean);
        bean.add();
    }

    @Test
    public void testService3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        bean2 bean = (bean2) context.getBean("bean2");
        System.out.println(bean);
        bean.add();
    }

    @Test
    public void testService4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        PropertyDemo1 propertyDemo1 = (PropertyDemo1) context.getBean("propertyDemo1");
        System.out.println(propertyDemo1);
        System.out.println(propertyDemo1.getName());
    }

    @Test
    public void testService5() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService6() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.getPname());
    }

}
