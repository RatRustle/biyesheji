package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weipeng
 * @Date 2022/6/13 10:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classification {
    //主键
    Integer id;
    //类别名称
    String name;
    //类别图片
    String image;
    //类别长图
    String longImage;
}
