package com.example.demo.dao;

import com.example.demo.bean.Professor;
import com.example.demo.bean.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoInfoDao {
    @Autowired
    JdbcTemplate template;

    /**
     * 根据专家号查询视频合集
     * @return
     */
    public List getVideoByProfessorCode(String professorcode) {
        List<VideoInfo> list = template.query("select * from video_info where professorcode = ? " ,new Object[]{professorcode} , new BeanPropertyRowMapper(VideoInfo.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }

    /**
     * 根据视频编码查询视频合集
     * @param code
     * @return
     */
    public VideoInfo getVideoByCode(String code) {
        List<VideoInfo> list = template.query("select * from video_info where code = ? " ,new Object[]{code} , new BeanPropertyRowMapper(VideoInfo.class));
        if (!list.isEmpty()){
            return list.get(0);
        }
        else{
            return null;
        }
    }

    /**
     * 根据是否为短视频 查询视频合集
     * @param isshort
     * @return
     */
    public List getVideoByIsShort(Integer isshort) {
        List<VideoInfo> list = template.query("select * from video_info where isshort = ? " ,new Object[]{isshort} , new BeanPropertyRowMapper(VideoInfo.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }
}
