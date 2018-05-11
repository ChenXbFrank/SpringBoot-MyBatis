package com.cxb.sbm.controller;

import com.cxb.sbm.model.Happiness;
import com.cxb.sbm.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 81046 on 2018-05-11
 */
@RestController
@RequestMapping("/happy")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public Happiness testQuery(){
        return happinessService.selectService("北京");
    }

    @RequestMapping("/insert")
    public Happiness testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }

    @RequestMapping("/queryXml")
    public Happiness testQueryXml(){
        return happinessService.selectServiceXml("北京");
    }

    @RequestMapping("/insertXml")
    public Happiness testInsertXml(){
        happinessService.insertServiceXml();
        return happinessService.selectServiceXml("成都");
    }

    @RequestMapping("/queryList")
    public List<Happiness> queryList(){
        return happinessService.selectListByCity("成都");
    }
}
