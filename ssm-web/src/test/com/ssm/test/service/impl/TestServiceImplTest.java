package com.ssm.test.service.impl;

import com.ssm.test.bean.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author saodiseng
 * @pachage com.ssm.test.service.impl.
 * @description {TODO}功能描述.
 * @date 16/7/21 下午1:10
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestServiceImplTest {

    @Resource
    private TestServiceImpl testService;

    @Test
    public void insert() throws Exception {

        TestBean tb = new TestBean();
        tb.setId(1111);
        this.testService.insert(tb);
    }

}