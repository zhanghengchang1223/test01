package com.zhang;

import com.zhang.service.MySevice;
import com.zhang.service.imp.MySomeImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSomeService {
    @Test
    public void testSomeService(){
        MySevice someService = new MySomeImp();
        someService.doSome();
    }

    @Test
    public void testSomeService02(){
        // 指定spring容器创建的对象
        // 指定spring配置文件的名称
        String config = "beans.xml";
        // 创建spring容器的对象，ApplicationContext
        // ClassPathXmlApplicationContext表示从类路径中加载
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器汇总获取某个对象，调用方法
        MySevice service = (MySevice) ac.getBean("SomeService");
        // 使用spring创建好的对象
        service.doSome();
    }
}
