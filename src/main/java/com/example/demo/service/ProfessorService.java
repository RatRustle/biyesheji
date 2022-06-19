package com.example.demo.service;

import com.example.demo.bean.Goods;
import com.example.demo.dao.GoodsDao;
import com.example.demo.dao.ProfessorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    ProfessorDao dao;

    /**
     * 获取所有医生信息
     * @return
     */
    public List getAllProfessor() {
        return dao.getAllProfessor();
    }

    /**
     * 根据专家号查询专家信息
     * @return
     */
    public List getProfessorByCode(String code) {
        return dao.getProfessorByCode(code);
    }
}
