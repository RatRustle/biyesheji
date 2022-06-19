package com.example.demo.service;

import com.example.demo.bean.Classification;
import com.example.demo.dao.ClassificationDao;
import com.example.demo.dao.ProfessorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationService {
    @Autowired
    ClassificationDao dao;

    /**
     * 获取所有分类信息
     * @return
     */
    public List getAllClassification() {
        return dao.getAllClassification();
    }

    /**
     * 根据id获得分类信息
     * @return
     */
    public List getClassificationById(Integer id) {
        return dao.getClassificationById(id);
    }

}
