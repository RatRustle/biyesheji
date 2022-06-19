package com.example.demo.dao;

import com.example.demo.bean.HealthTest;
import com.example.demo.bean.VideoType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HealthTestDao {
    @Autowired
    JdbcTemplate template;

    /**
     *
     * @return
     */
    public List getAllHealthTest() {
        List<HealthTest> list = template.query("select * from health_test " , new BeanPropertyRowMapper(HealthTest.class));
        if (!list.isEmpty()){
            return list;
        }
        else{
            return null;
        }
    }
}
