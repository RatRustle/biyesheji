package com.example.demo.service;

import com.example.demo.dao.VideoInfoDao;
import com.example.demo.dao.VideoTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoTypeService {
    @Autowired
    VideoTypeDao dao;

    /**
     *
     * @return
     */
    public List getVideoCodeByTypeId(Integer typeid) {
        return dao.getVideoCodeByTypeId(typeid);
    }

}
