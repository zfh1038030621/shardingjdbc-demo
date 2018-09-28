import com.zfh.Application;
import com.zfh.exam.UserInfo;
import com.zfh.exam.UserInfoMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@SpringBootTest(classes = {Application.class})
public class Test {
    @Autowired
    UserInfoMapper mapper;
    @org.junit.Test
    public void insert() throws Exception {

        UserInfo record = new UserInfo();
        record.setUsername("zfh");
        record.setSex("男");

        int result = mapper.insertSelective(record) ;

        System.out.println( result > 0 ? "插入成功" : "插入失败");
    }
}
