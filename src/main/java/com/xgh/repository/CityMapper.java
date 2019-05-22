package com.xgh.repository;

import com.xgh.domain.City;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    /*int countByExample(CityExample example);

    int deleteByExample(CityExample example);
*/
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

 /*   List<City> selectByExample(CityExample example);*/


    @Select("select * from city where id = #{id}")
    City selectByPrimaryKey(Integer id);

  /*  int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);
*/
    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}