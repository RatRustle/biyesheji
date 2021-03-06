package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weipeng
 * @Date 2022/5/31 13:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
    //主键
    String id;
    //专家号
    String code;
    //姓名
    String name;
    //性别
    String sex;
    //年龄
    Integer age;
    //医院
    String hospital;
    //简介
    String intro;
    //头像
    String image;
    //标签
    String label;
    //名片
    String card;
    //
    String test;
    //hotfix测试
    String hotFix;
    //master修改代码
    //hotfix修改代码
    //pushtest
    //测试远程拉取
}
