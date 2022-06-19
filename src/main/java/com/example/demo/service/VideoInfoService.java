package com.example.demo.service;

import com.example.demo.bean.VideoInfo;
import com.example.demo.dao.ProfessorDao;
import com.example.demo.dao.VideoInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoService {
    @Autowired
    VideoInfoDao dao;

    /**
     * 根据专家号查询视频合集
     * @return
     */
    public List getVideoByProfessorCode(String professorcode) {
        return dao.getVideoByProfessorCode(professorcode);
    }

    /**
     * 根据编码查询视频
     * @return
     */
    public VideoInfo getVideoByCode(String code) {
        return dao.getVideoByCode(code);
    }

    /**
     * 根据是否为短视频 查询视频合集
     * @return
     */
    public List getVideoByIsShort(Integer isshort) {
        return dao.getVideoByIsShort(isshort);
    }
}
