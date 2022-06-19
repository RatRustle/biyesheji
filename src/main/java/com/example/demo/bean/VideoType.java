package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weipeng
 * @Date 2022/6/1 10:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoType {
    //主键
    Integer id;
    //分类id
    Integer typeId;
    //视频code
    String videoCode;
}
