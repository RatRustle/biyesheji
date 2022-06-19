package com.example.demo.controller;

import com.example.demo.bean.Goods;
import com.example.demo.bean.Professor;
import com.example.demo.bean.ResBody;
import com.example.demo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    @Autowired
    ProfessorService service;

    @GetMapping("/api/getAllProfessor")
    public ResBody getAllProfessor() {
        ResBody resBody = new ResBody();
        List<Professor> list= service.getAllProfessor();
        int count = list.size();
        resBody.setCount(count);
        resBody.setData(list);
        resBody.setCode(200);
        resBody.setMsg("查询成功！");
        return resBody;
    }

    @GetMapping("/api/getProfessorByCode")
    public ResBody getProfessorByCode(@RequestParam String code) {
        ResBody resBody = new ResBody();
        List<Professor> list= service.getProfessorByCode(code);
        int count = list.size();
        resBody.setCount(count);
        resBody.setData(list);
        resBody.setCode(200);
        resBody.setMsg("查询成功！");
        return resBody;
    }

}
