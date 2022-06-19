package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weipeng
 * @Date 2022/6/1 11:16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealthTest {
    //主键
    Integer id;
    //标题
    String title;
    //网址
    String url;
    //图片
    String image;
    //简介
    String intro;
}
