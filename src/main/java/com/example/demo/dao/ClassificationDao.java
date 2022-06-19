package com.example.demo.dao;

import com.example.demo.bean.Classification;
import com.example.demo.bean.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassificationDao {
    @Autowired
    JdbcTemplate template;

    /**
     * 获取所有分类信息
     * @return
     */
    public List getAllClassification() {
        List<Classification> list = template.query("select * from classification "  , new BeanPropertyRowMapper(Classification.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }

    public List getClassificationById(Integer id) {
        List<Classification> list = template.query("select * from classification where id = ? ",new Object[]{id}  , new BeanPropertyRowMapper(Classification.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }
}
