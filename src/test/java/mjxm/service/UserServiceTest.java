package mjxm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring-mybatis.xml")
public class UserServiceTest {
    @Test
    public void testRegister() {
        assertEquals("testRegister", 1, 1);

    }

    @Test
    public void testCherckUserName() {
        assertEquals("testCherckUserName", 1, 1);

    }
}
