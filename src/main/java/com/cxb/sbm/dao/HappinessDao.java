package com.cxb.sbm.dao;

import com.cxb.sbm.model.Happiness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 81046 on 2018-05-11
 */
@Mapper
public interface HappinessDao {

    @Select("SELECT * FROM happiness WHERE city = #{city}")
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("INSERT INTO happiness(city, num) VALUES(#{city}, #{num})")
    int insertHappiness(@Param("city") String city, @Param("num") Integer num);

    //下面的两个方法都是xml中配置的
    Happiness findHappinessByCityXml(String city);

    int insertHappinessXml(HashMap<String, Object> map);

    List<Happiness> selectListByCity(String city);

}
