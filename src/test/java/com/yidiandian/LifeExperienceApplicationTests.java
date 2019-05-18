package com.yidiandian;

import com.yidiandian.dao.DynamicsDao;
import com.yidiandian.dao.DynamicsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LifeExperienceApplicationTests {

    @Autowired
    DynamicsService dynamicsService;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test(){
        List<Map<String, Object>> map =  dynamicsService.selectByParam( "user_info"," ",null );
        System.out.println("得到的结果："+map.toString());
    }

}
