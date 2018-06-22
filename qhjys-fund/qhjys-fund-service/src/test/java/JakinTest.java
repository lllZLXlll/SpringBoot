import com.qhjys.fund.common.constant.RedisConstants;
import com.qhjys.fund.common.util.RedisUtil;
import com.qhjys.fund.entity.FundUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JakinTest.class)
public class JakinTest {

    @Value("${qhjys.rmi.port}")
    private int port;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1() {

        // int
        RedisUtil.set("id", "1");
        System.out.println(RedisUtil.get("id"));
        System.out.println();

        // String
        String key = RedisConstants.COMMON_USER_ID_USER_MOBILE_ + "123" + "_" + "13088883935";
        RedisUtil.set(key, "金钥匙集团Jakin", 7, TimeUnit.HOURS);
        System.out.println(RedisUtil.get(key));
        System.out.println();

        // List
        List<FundUser> users = new ArrayList<>();
        FundUser user1 = new FundUser();
        user1.setId(1L);
        user1.setUserName("小米");
        users.add(user1);

        FundUser user2 = new FundUser();
        user2.setId(2L);
        user2.setUserName("大米");
        users.add(user2);

        RedisUtil.setList("users", users);
        List<FundUser> list = (ArrayList<FundUser>) RedisUtil.getList("users", FundUser.class);
        for (FundUser user : list) {
            System.out.println(user.getId() + " - " + user.getUserName());
        }
        System.out.println();

        // Object
        RedisUtil.setObject("user", user1);
        FundUser user = (FundUser) RedisUtil.getObject("user", FundUser.class);
        System.out.println(user.getId() + " - " + user.getUserName());

    }

    @Test
    public void test2() {
        System.out.println(port);
        stringRedisTemplate.opsForValue().set("aaaa", "aaaa");
        System.out.println(stringRedisTemplate.opsForValue().get("aaaa"));
    }
}
