import com.POJO.SignIn;
import com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerOutput;
import com.service.LoginServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Jaime
 * @Date: 2018/4/13 23:23
 * @Description: *
 */
public class TestLogin {
    @Autowired
    LoginServiceImpl loginService;
   SignIn signIn;
    @Test
    public void ss() {
      /* signIn=loginService.clientLogin("admin","1234");
        if (signIn ==null) {
        System.out.println("不存在");
    }
        else
                System.out.println("存在");*/
        System.out.println(loginService.findGood());
}
}
