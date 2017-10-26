package springaop;

import com.SpringAop.mapper.dao.UserMapper;
import com.SpringAop.pojo.User;
import com.SpringAop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mayue
 * @date 2017-10-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class SpringAopTest {

    @Autowired
    private UserService userService;

    @Test
    public void aopTest1(){
        User user = new User();
        user.setUsername("monster");
        user.setPassword("123456");

        userService.addUser(user);

        userService.deleteUser(1);
    }
}
