package com.example.demo.controller;

import com.example.demo.bean.HealthTest;
import com.example.demo.bean.Professor;
import com.example.demo.bean.ResBody;
import com.example.demo.service.HealthTestService;
import com.example.demo.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthTestController {
    @Autowired
    HealthTestService service;

    @GetMapping("/api/getAllHealthTest")
    public ResBody getAllHealthTest() {
        ResBody resBody = new ResBody();
        List<HealthTest> list= service.getAllHealthTest();
        if (list!=null&&!list.isEmpty()){
            int count = list.size();
            resBody.setCount(count);
            resBody.setData(list);
            resBody.setCode(200);
            resBody.setMsg("查询成功！");
        }
        else {
            resBody.setCount(0);
            resBody.setData(list);
            resBody.setCode(201);
            resBody.setMsg("查询成功！");
        }

        return resBody;
    }

}
