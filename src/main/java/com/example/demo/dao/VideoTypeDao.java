package com.example.demo.dao;

import com.example.demo.bean.VideoInfo;
import com.example.demo.bean.VideoType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoTypeDao {
    @Autowired
    JdbcTemplate template;

    /**
     *
     * @return
     */
    public List getVideoCodeByTypeId(Integer typeid) {
        List<VideoType> list = template.query("select * from video_type where typeid = ? " ,new Object[]{typeid} , new BeanPropertyRowMapper(VideoType.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }
}
