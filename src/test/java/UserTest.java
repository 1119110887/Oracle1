import com.hyb.dao.UserDao;
import com.hyb.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: 黄毅斌
 * @Description:
 * @Date: Created in 16:08 2020/7/3/003
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void findAll(){
        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        System.out.println(116);System.out.println(116);System.out.println(116);
    }

    @Test
    public void insertUser(){
        User user = new User();
        user.setUsername("钱七");
        user.setAge(15);
        Integer integer = userDao.insertUser(user);
        System.out.println(integer);
    }

    @Test
    public void deleteUser(){
        User user = new User();
        user.setUsername("钱七");
        user.setAge(15);
        Integer integer = userDao.deleteUser(user);
        System.out.println(integer);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setUsername("钱七");
        user.setAge(16);
        Integer integer = userDao.updateUser(user);
        System.out.println(integer);
    }
}
