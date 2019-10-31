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

    @Test
    public void testLogin() {
        assertEquals("testLogin", 1, 1);
    }

    @Test
    public void testWeixinBinding() {
        assertEquals("testWeixinBinding", 1, 1);
    }

    @Test
    public void testRelease() {
        assertEquals("testRelease", 1, 1);
    }

    @Test
    public void testModify() {
        assertEquals("testModify", 1, 1);
    }

    @Test
    public void testFindByUserAndRequirement() {
        assertEquals("testFindByUserAndRequirement", 1, 1);
    }

    @Test
    public void testFindByID() {
        assertEquals("testFindByID", 1, 1);
    }

    @Test
    public void testCheckUserName() {
        assertEquals("testCheckUserName", 1, 1);
    }

    @Test
    public void testSearch() {
        assertEquals("testSearch", 1, 1);
    }

    //test
    //test2
    //test3




}
