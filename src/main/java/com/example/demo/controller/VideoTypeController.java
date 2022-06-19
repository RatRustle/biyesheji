package com.example.demo.controller;

import com.example.demo.bean.Professor;
import com.example.demo.bean.ResBody;
import com.example.demo.bean.VideoInfo;
import com.example.demo.bean.VideoType;
import com.example.demo.service.VideoInfoService;
import com.example.demo.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VideoTypeController {
    @Autowired
    VideoTypeService service;

    @Autowired
    VideoInfoService videoInfoService;

    @GetMapping("/api/getVideoListByTypeId")
    public ResBody getVideoListByTypeId(@RequestParam Integer typeid) {
        ResBody resBody = new ResBody();
        List<VideoInfo> videoInfos = new ArrayList<>();
        //根据typeid查询出所有的videocode
        List<VideoType> list= service.getVideoCodeByTypeId(typeid);
        if (list!=null&&!list.isEmpty()){
            for (VideoType videoType : list) {
                String videoCode = videoType.getVideoCode();
                //根据videoCode查询视频信息
                VideoInfo videoInfo = videoInfoService.getVideoByCode(videoCode);
                if (videoInfo!=null){
                    videoInfos.add(videoInfo);
                }
            }
            int count = list.size();
            resBody.setCount(count);
            resBody.setData(videoInfos);
            resBody.setCode(200);
            resBody.setMsg("查询成功！");
        }
        else {
            resBody.setCount(0);
            resBody.setData(videoInfos);
            resBody.setCode(201);
            resBody.setMsg("查询成功！");
        }

        return resBody;
    }

}
