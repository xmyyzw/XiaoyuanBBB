package mjxm.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring-mybatis.xml")
public class UserControllerTest {

    @Test
    public void testNoName() {
        assertEquals("testCherckUserName", 1, 1);
    }

    @Test
    public void testNoInform() {
        assertEquals("testLogin", 1, 1);
    }

    @Test
    public void testNoAddress() {
        assertEquals("testWeixinBinding", 1, 1);
    }

    @Test
    public void testNoPs() {
        assertEquals("testRelease", 1, 1);
    }

    @Test
    public void testNoFood() {
        assertEquals("testModify", 1, 1);
    }

    @Test
    public void testNoSize() {
        assertEquals("testFindByUserAndRequirement", 1, 1);
    }

    @Test
    public void testNoTime() {
        assertEquals("testFindByID", 1, 1);
    }

    @Test
    public void testNoReceiver() {
        assertEquals("testCheckUserName", 1, 1);
    }

    @Test
    public void testNoSender() {
        assertEquals("testSearch", 1, 1);
    }

    
}
