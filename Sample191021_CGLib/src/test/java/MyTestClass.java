import com.ofweek.Huntress;
import com.ofweek.MyBeanFactory;
import org.junit.Test;

public class MyTestClass {
    @Test
    public void demo01() {
        System.out.println("demo01");
        //目标类
        Huntress huntress = MyBeanFactory.createHuntress();
        huntress.setTrap(50, 100);

    }
}
