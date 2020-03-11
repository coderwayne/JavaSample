import com.ofweek.dao.UserDao;
import com.ofweek.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {
    @Test
    public void demo01() throws IOException {
        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = factoryBuilder.build(inputStream);
        //使用工厂创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //这里要用到动态代理，利用SqlSession创建UserDao的代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //使用代理对象执行方法
        List<User> allUser = userDao.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}
