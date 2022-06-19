package com.example.demo.service;

import com.example.demo.dao.HealthTestDao;
import com.example.demo.dao.VideoTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthTestService {
    @Autowired
    HealthTestDao dao;

    /**
     *
     * @return
     */
    public List getAllHealthTest() {
        return dao.getAllHealthTest();
    }

}
