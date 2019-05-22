package com.xgh.repository;

import com.xgh.BaseTest;
import com.xgh.domain.City;
import org.junit.Assert;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by XGH on 2019/5/22
 */
public class CityMapperTest extends BaseTest {

    @Autowired
    CityMapper cityMapper;
    @Autowired
    SqlSessionTemplate test1SqlSessionTemplate;

    @Test
    public void selectByPrimaryKey() {
       /* City city = cityMapper.selectByPrimaryKey(1);
        System.out.println(city);
        Assert.assertNotNull(city);*/
        Object o = test1SqlSessionTemplate.selectOne("com.xgh.repository.CityMapper.selectByPrimaryKey",1);
        System.out.println(o);
        Assert.assertNotNull(o);
    }
}