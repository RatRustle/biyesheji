package com.example.demo.dao;

import com.example.demo.bean.Goods;
import com.example.demo.bean.Professor;
import com.example.demo.bean.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessorDao {
    @Autowired
    JdbcTemplate template;

    /**
     * 获取所有医生信息
     * @return
     */
    public List getAllProfessor() {
        List<Professor> list = template.query("select * from professor "  , new BeanPropertyRowMapper(Professor.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }

    /**
     * 根据专家号查询专家信息
     * @return
     */
    public List getProfessorByCode(String code) {
        List<Professor> list = template.query("select * from professor where code = ?"  ,new Object[]{code} , new BeanPropertyRowMapper(Professor.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }

}
