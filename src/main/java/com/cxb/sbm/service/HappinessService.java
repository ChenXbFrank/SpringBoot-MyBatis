package com.cxb.sbm.service;

import com.cxb.sbm.dao.HappinessDao;
import com.cxb.sbm.model.Happiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 81046 on 2018-05-11
 */
@Service
public class HappinessService {
    @Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        happinessDao.insertHappiness("西安", 9421);
        happinessDao.insertHappiness("长安", 1294);
    }

    //这里是测试xml文件中配置的两个方法
    public Happiness selectServiceXml(String city){
        return happinessDao.findHappinessByCityXml(city);
    }

    @Transactional
    public void insertServiceXml(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("city", "忠县");
        map.put("num", 9999);
        happinessDao.insertHappinessXml(map);
    }

    //这里是返回的集合
    public List<Happiness> selectListByCity(String city){
        return happinessDao.selectListByCity(city);
    }
}