import cn.cjj.blogcjj.dao.UserMapper;
import cn.cjj.blogcjj.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author CuiJunJie
 * @create 2021/4/29-16:32
 */
public class TestUser {

    ApplicationContext applicationContext;
    SqlSessionFactoryBean sqlSessionFactoryBean;
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        sqlSessionFactoryBean = applicationContext.getBean(SqlSessionFactoryBean.class);
        sqlSessionFactory = sqlSessionFactoryBean.getObject();
        assert sqlSessionFactory != null;
    }

    @Test
    public void testGetUserById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }
}
