package com.example.demo.controller;

import com.example.demo.bean.Professor;
import com.example.demo.bean.ResBody;
import com.example.demo.bean.VideoInfo;
import com.example.demo.service.ProfessorService;
import com.example.demo.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VideoInfoController {
    @Autowired
    VideoInfoService service;

    @GetMapping("/api/getVideoByProfessorCode")
    public ResBody getVideoByProfessorCode(@RequestParam String professorcode) {
        ResBody resBody = new ResBody();
        List<VideoInfo> list= service.getVideoByProfessorCode(professorcode);
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
            resBody.setMsg("后台无数据！");
        }
        return resBody;
    }

    @GetMapping("/api/getVideoByCode")
    public ResBody getVideoByCode(@RequestParam String code) {
        ResBody resBody = new ResBody();
        VideoInfo video = service.getVideoByCode(code);
        List<VideoInfo> list = new ArrayList<>();
        list.add(video);
        if (video!=null){
            resBody.setCount(1);
            resBody.setData(list);
            resBody.setCode(200);
            resBody.setMsg("查询成功！");
        }
        else {
            resBody.setCount(0);
            resBody.setData(list);
            resBody.setCode(201);
            resBody.setMsg("后台无数据！");
        }

        return resBody;
    }

    @GetMapping("/api/getVideoByIsShort")
    public ResBody getVideoByIsShort(@RequestParam Integer isshort) {
        ResBody resBody = new ResBody();
        List<VideoInfo> list = service.getVideoByIsShort(isshort);
        if (list!=null){
            resBody.setCount(1);
            resBody.setData(list);
            resBody.setCode(200);
            resBody.setMsg("查询成功！");
        }
        else {
            resBody.setCount(0);
            resBody.setData(list);
            resBody.setCode(201);
            resBody.setMsg("后台无数据！");
        }

        return resBody;
    }

}
