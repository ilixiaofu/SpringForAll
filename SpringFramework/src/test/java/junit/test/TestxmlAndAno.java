package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webapp.xmlAndAno.BookService;

public class TestxmlAndAno {
    @Test
    public void testxmlAndAno() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.add();
    }
}
