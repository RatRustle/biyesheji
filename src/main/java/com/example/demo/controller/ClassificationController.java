package com.example.demo.controller;

import com.example.demo.bean.Classification;
import com.example.demo.bean.Professor;
import com.example.demo.bean.ResBody;
import com.example.demo.service.ClassificationService;
import com.example.demo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassificationController {
    @Autowired
    ClassificationService service;

    @GetMapping("/api/getAllClassification")
    public ResBody getAllClassification() {
        ResBody resBody = new ResBody();
        List<Classification> list= service.getAllClassification();
        int count = list.size();
        resBody.setCount(count);
        resBody.setData(list);
        resBody.setCode(200);
        resBody.setMsg("查询成功！");
        return resBody;
    }

    @GetMapping("/api/getClassificationById")
    public ResBody getClassificationById(@RequestParam int typeid) {
        ResBody resBody = new ResBody();
        List<Classification> list= service.getClassificationById(typeid);
        int count = list.size();
        resBody.setCount(count);
        resBody.setData(list);
        resBody.setCode(200);
        resBody.setMsg("查询成功！");
        return resBody;
    }

}
