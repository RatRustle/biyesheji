package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weipeng
 * @Date 2022/5/31 15:15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoInfo {
    //主键
    Integer id;
    //编码
    String code;
    //视频名称
    String name;
    //视频图片
    String image;
    //视频简介
    String intro;
    //专家编号
    String professorCode;
    //视频地址
    String url;
    //是否为短视频 1：是   0：否
    Integer isShort;
    //视频封面图
    String videoImage;
}
